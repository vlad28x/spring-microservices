package kz.vlad28x.examinatorservice.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import kz.vlad28x.examinatorservice.model.QuestionDto
import kz.vlad28x.examinatorservice.service.ExaminatorService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

private val log = KotlinLogging.logger { }

@RestController
@RequestMapping("/api/v1/exam")
class ExaminatorController(
    private val examinatorService: ExaminatorService,
) {

    @PostMapping
    fun generateExam(@RequestBody examMeta: Map<String, Int>): Map<String, Array<QuestionDto>?> {
        val rqUid = UUID.randomUUID().toString()
        log.info { "rqUid: $rqUid. Exam to generate: $examMeta" }
        return examinatorService.generateExam(examMeta, rqUid)
    }

}