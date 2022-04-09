package htlong.learn.youtube.data.source.suggestquery.remote

import com.google.gson.Gson
import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource
import htlong.learn.youtube.data.source.suggestquery.remote.api.SuggestQueryClient
import htlong.learn.youtube.utils.Utils

class SuggestQueryRemoteDatasource private constructor() : ISuggestQueryDataSource.Remote {

    private var server = 0

    override suspend fun suggest(q: String): ApiResponse.SuggestQuery {
        val result = ApiResponse.SuggestQuery(query = q, isHistory = false, suggests = listOf())
        if (q.isNotBlank()) {
            try {
                val res = when (server) {
                    1 -> SuggestQueryClient.clients1.search(q)
                    2 -> SuggestQueryClient.clients2.search(q)
                    3 -> SuggestQueryClient.clients3.search(q)
                    else -> SuggestQueryClient.default.search(q)
                }
                server = (server + 1) % 4

                res.body()?.let {
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