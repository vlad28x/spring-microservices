package kz.vlad28x.historyservice.repository

import kz.vlad28x.historyservice.model.QuestionEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RestResource

@RestResource(path = "questions")
interface QuestionRepository : JpaRepository<QuestionEntity, Int>