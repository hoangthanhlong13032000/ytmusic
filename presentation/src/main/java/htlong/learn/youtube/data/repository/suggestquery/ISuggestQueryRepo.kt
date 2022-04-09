package htlong.learn.youtube.data.repository.suggestquery

import htlong.learn.youtube.data.model.ApiResponse

interface ISuggestQueryRepo {
    suspend fun suggest(query: String): ApiResponse.SuggestQuery
    suspend fun save(query: String)
    suspend fun save(histories: List<String>)
}