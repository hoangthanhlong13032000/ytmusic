package htlong.learn.domain.usecases.suggestquery

import htlong.learn.domain.repositories.ISuggestQueryRepo

class RemoveHistoryQueryUseCase(private val sgRepo: ISuggestQueryRepo) {
    suspend operator fun invoke(): Boolean = sgRepo.clear()
    suspend operator fun invoke(query: String): Int = sgRepo.remove(query = query)
}