package htlong.learn.data.remote.services

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SuggestQueryService {
    @GET("/complete/search?client=firefox&hl=en&gl=vn&gs_ri=firefox&ds=yt")
    suspend fun search(@Query("q") query: String): Response<String>

    companion object {
        const val URL = "https://suggestqueries.google.com"
    }
}