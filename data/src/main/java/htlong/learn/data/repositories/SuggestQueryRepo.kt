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
            if (query.isBlank()) SuggestQuery(query = query, suggests = arrayListOf())
            else SQRemoteDS.suggest(q = query)
        }
    }

    override suspend fun save(queries: ArrayList<String>): Boolean {
        return withContext(dispatcher) {
            SQLocalDS.save(histories = queries)
        }
    }


    override suspend fun getSaved(): ArrayList<String> {
        return withContext(dispatcher) {
            SQLocalDS.getSaved()
        }
    }

    override suspend fun remove(query: String): Int {
        return withContext(dispatcher) {
            val savedQueries = ArrayList(SQLocalDS.getSaved())
            val pos = savedQueries.indexOf(query)
            if (pos > -1) {
                savedQueries.removeAt(pos)
                SQLocalDS.save(histories = savedQueries)
            }
            pos
        }
    }

    override suspend fun clear(): Boolean {
        return withContext(dispatcher) {
            SQLocalDS.clear()
        }
    }

    override suspend fun removeAndGetSaved(query: String): ArrayList<String> {
        return withContext(dispatcher) {
            val savedQueries = ArrayList(SQLocalDS.getSaved())
            savedQueries.remove(query)
            SQLocalDS.save(histories = savedQueries)
            savedQueries
        }
    }

    companion object {
        private var instance: SuggestQueryRepo? = null
        fun getInstance(
            SQRemoteDS: ISuggestQueryDataSource.Remote,
            SQLocalDS: ISuggestQueryDataSource.Local,
        ) = instance ?: SuggestQueryRepo(SQRemoteDS, SQLocalDS).also { instance = it }
    }
}