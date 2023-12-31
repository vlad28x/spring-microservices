package kz.vlad28x.mathservice.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import kz.vlad28x.mathservice.common.RQUID_HEADER
import kz.vlad28x.mathservice.model.Question
import kz.vlad28x.mathservice.service.MathQuestionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger { }

@RestController
@RequestMapping("/api/v1/questions")
class MathQuestionController(
    private val mathQuestionService: MathQuestionService
) {

    @GetMapping
    fun getQuestions(@RequestParam count: Long, @RequestHeader(RQUID_HEADER, required = false) rqUid: String?): List<Question> {
        log.info { "rqUid: $rqUid. Generate $count math questions" }
        return mathQuestionService.generateQuestions(count)
    }

}