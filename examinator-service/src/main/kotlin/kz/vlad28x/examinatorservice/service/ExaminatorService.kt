package kz.vlad28x.examinatorservice.service

import io.github.oshai.kotlinlogging.KotlinLogging
import kz.vlad28x.examinatorservice.common.RQUID_HEADER
import kz.vlad28x.examinatorservice.model.QuestionDto
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

private val log = KotlinLogging.logger { }

@Service
class ExaminatorService(
        private val restTemplate: RestTemplate,
        @Value("\${services.exams}")
        private val exams: Set<String>,
) {

    fun generateExam(examMeta: Map<String, Int>, rqUid: String) =
            examMeta.entries
                    .filter { exams.contains(it.key.lowercase()) }
                    .associate {
                        val headers = HttpHeaders()
                        headers.set(RQUID_HEADER, rqUid)
                        val entity = HttpEntity<Array<QuestionDto>>(headers)
                        val url = "http://${it.key}-service/api/v1/questions?count=${it.value}"
                        log.info { "URL: $url" }
                        it.key.uppercase() to restTemplate.exchange(
                                url,
                                HttpMethod.GET,
                                entity,
                                Array<QuestionDto>::class.java
                        ).body
                    }

}