package htlong.learn.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SuggestQueryApi {
    @GET("/complete/search?client=firefox&hl=en&gl=vn&gs_ri=firefox&ds=yt")
    suspend fun search(@Query("q") query: String): Response<String>
}