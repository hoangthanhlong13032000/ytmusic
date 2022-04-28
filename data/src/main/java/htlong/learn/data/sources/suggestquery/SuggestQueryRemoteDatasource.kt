package htlong.learn.data.sources.suggestquery

import com.google.gson.Gson
import htlong.learn.data.helpers.NetworkHelper
import htlong.learn.data.api.SuggestQueryApi
import htlong.learn.data.common.Utils
import htlong.learn.domain.entities.SuggestQuery

class SuggestQueryRemoteDatasource private constructor() : ISuggestQueryDataSource.Remote {
    private val sgApi = NetworkHelper.createApi(SuggestQueryApi.URL, SuggestQueryApi::class.java)

    override suspend fun suggest(q: String): SuggestQuery {
        val result = SuggestQuery(query = q, isHistory = false, suggests = listOf())
        if (q.isNotBlank()) {
            try {
                sgApi.search(q).body()?.let {
                    val body = Gson().fromJson(it, List::class.java)
                    result.suggests = body[1] as List<String>
                }
            } catch (e: Exception) {
                Utils.handleException("suggest_query", e)
            }
        }

        return result
    }

    companion object {
        private var instance: SuggestQueryRemoteDatasource? = null
        fun getInstance() = instance ?: SuggestQueryRemoteDatasource().also { instance = it }
    }
}