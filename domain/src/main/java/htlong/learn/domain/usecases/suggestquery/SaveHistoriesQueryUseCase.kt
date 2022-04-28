package htlong.learn.domain.usecases.suggestquery

import htlong.learn.domain.repositories.ISuggestQueryRepo

class SaveHistoriesQueryUseCase(private val sgRepo: ISuggestQueryRepo) {
    suspend operator fun invoke(query: String) = sgRepo.save(query = query)
    suspend operator fun invoke(histories: List<String>) = sgRepo.save(histories = histories)
}