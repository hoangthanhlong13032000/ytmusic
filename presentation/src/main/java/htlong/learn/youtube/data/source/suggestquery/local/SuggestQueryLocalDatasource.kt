package htlong.learn.youtube.data.source.suggestquery.local

import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.data.source.datastore.DataStoreHelper
import htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource

class SuggestQueryLocalDatasource private constructor(private val dataStoreHelper: DataStoreHelper) :
    ISuggestQueryDataSource.Local {
    override suspend fun getAll(): ApiResponse.SuggestQuery {
        return ApiResponse.SuggestQuery(query = "", isHistory = true, suggests = dataStoreHelper.getSearchHistories())
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