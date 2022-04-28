package htlong.learn.domain.usecases.suggestquery

import htlong.learn.domain.entities.SuggestQuery
import htlong.learn.domain.repositories.ISuggestQueryRepo

class GetSuggestQueryUseCase(private val sgRepo: ISuggestQueryRepo) {
    suspend operator fun invoke(query: String): SuggestQuery = sgRepo.suggest(query = query)
}