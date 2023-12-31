package kz.vlad28x.historyservice.model

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY

@MappedSuperclass
abstract class AbstractEntity (
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Int = 0
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AbstractEntity

        return id != 0 && id == other.id
    }

    override fun hashCode(): Int {
        return 31
    }
}

@Entity
@Table(name = "question")
data class QuestionEntity(
    val question: String,
    val answer: String,
) : AbstractEntity()

data class QuestionDto(
    val question: String,
    val answer: String,
)