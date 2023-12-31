package kz.vlad28x.historyservice.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import kz.vlad28x.historyservice.common.RQUID_HEADER
import kz.vlad28x.historyservice.model.QuestionDto
import kz.vlad28x.historyservice.service.HistoryQuestionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger { }

@RestController
@RequestMapping("/api/v1/questions")
class HistoryQuestionController(
    private val historyQuestionService: HistoryQuestionService
) {

    @GetMapping
    fun getQuestions(@RequestParam count: Long, @RequestHeader(RQUID_HEADER, required = false) rqUid: String?): List<QuestionDto> {
        log.info { "rqUid: $rqUid. Generate $count history questions" }
        return historyQuestionService.generateQuestions(count)
    }

}