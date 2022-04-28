package htlong.learn.data.repositories

import htlong.learn.data.sources.suggestquery.ISuggestQueryDataSource
import htlong.learn.domain.entities.SuggestQuery
import htlong.learn.domain.repositories.ISuggestQueryRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class SuggestQueryRepo private constructor(
    private val SQRemoteDS: ISuggestQueryDataSource.Remote,
    private val SQLocalDS: ISuggestQueryDataSource.Local,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : ISuggestQueryRepo {
    override suspend fun suggest(query: String): SuggestQuery {
        return withContext(dispatcher) {
            if (query.isBlank()) SQLocalDS.getAll()
            else SQRemoteDS.suggest(q = query)
        }
    }

    override suspend fun save(query: String) {
        withContext(dispatcher) { SQLocalDS.save(q = query) }
    }

    override suspend fun save(histories: List<String>) {
        withContext(dispatcher) { SQLocalDS.save(histories = histories) }
    }

    companion object {
        private var instance: SuggestQueryRepo? = null
        fun getInstance(
            SQRemoteDS: ISuggestQueryDataSource.Remote,
            SQLocalDS: ISuggestQueryDataSource.Local,
        ) = instance ?: SuggestQueryRepo(SQRemoteDS, SQLocalDS).also { instance = it }
    }
}