package htlong.learn.domain.usecases.suggestquery

import htlong.learn.domain.repositories.ISuggestQueryRepo

class GetHistoryQueryUseCase(private val sgRepo: ISuggestQueryRepo) {
    suspend operator fun invoke(): ArrayList<String> = sgRepo.getSaved()
}