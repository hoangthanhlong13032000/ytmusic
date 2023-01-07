package htlong.learn.domain.usecases.suggestquery

import htlong.learn.domain.Constant.MAX_QUERY_HISTORY_NUMBER
import htlong.learn.domain.repositories.ISuggestQueryRepo

class SaveHistoryQueryUseCase(private val sgRepo: ISuggestQueryRepo) {
    suspend operator fun invoke(query: String): Boolean {
        val histories = sgRepo.getSaved()
        histories.remove(query)
        histories.add(0, query)
        return sgRepo.save(
            queries = if (histories.size > MAX_QUERY_HISTORY_NUMBER) {
                ArrayList(histories.subList(0, MAX_QUERY_HISTORY_NUMBER))
            } else histories
        )
    }
}