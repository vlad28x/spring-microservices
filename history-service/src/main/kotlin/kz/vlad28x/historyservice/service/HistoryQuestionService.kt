package kz.vlad28x.historyservice.service

import kz.vlad28x.historyservice.model.QuestionDto
import kz.vlad28x.historyservice.model.QuestionEntity
import kz.vlad28x.historyservice.repository.QuestionRepository
import org.springframework.stereotype.Service

@Service
class HistoryQuestionService(
    private val questionRepository: QuestionRepository,
) {

    fun generateQuestions(count: Long): List<QuestionDto> = questionRepository.findAll().let {
        it.shuffle()
        it.stream().limit(count).map { QuestionDto(it.question, it.answer) }.toList()
    }

}
