package htlong.learn.data.sources.suggestquery.local

import htlong.learn.domain.entities.ResponseEntities
import htlong.learn.data.datastore.DataStoreHelper
import htlong.learn.data.sources.suggestquery.ISuggestQueryDataSource

class SuggestQueryLocalDatasource private constructor(private val dataStoreHelper: DataStoreHelper) :
    ISuggestQueryDataSource.Local {
    override suspend fun getAll(): ResponseEntities.SuggestQuery {
        return ResponseEntities.SuggestQuery(query = "", isHistory = true, suggests = dataStoreHelper.getSearchHistories())
    }

    override suspend fun save(q: String) {
        dataStoreHelper.saveSearchHistories(query = q)
    }

    override suspend fun save(histories: List<String>) {
        dataStoreHelper.saveSearchHistories(histories = histories)
    }

    companion object {
        private var instance: SuggestQueryLocalDatasource? = null
        fun getInstance(dataStoreHelper: DataStoreHelper) =
            instance ?: SuggestQueryLocalDatasource(dataStoreHelper).also { instance = it }
    }
}