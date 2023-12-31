package kz.vlad28x.mathservice.service

import kz.vlad28x.mathservice.model.Question
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Service
import java.util.stream.Stream
import kotlin.random.Random

@Service
@RefreshScope
class MathQuestionService {

    @Value("\${question.maxNumber}")
    private var maxNumber = 500_000

    fun generateQuestions(count: Long): List<Question> =
        Stream.generate(this::generateQuestion)
            .limit(count)
            .toList()

    private fun generateQuestion(): Question {
        val firstNumber = Random.nextInt(maxNumber)
        val secondNumber = Random.nextInt(maxNumber)
        return Question(
            question = "$firstNumber + $secondNumber = ?",
            answer = "${firstNumber + secondNumber}"
        )
    }

}
