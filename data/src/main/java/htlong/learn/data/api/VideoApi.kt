package htlong.learn.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoApi {
    @GET("/api/video/youtube")
    suspend fun searchByID(@Query("id") id: String): Response<String>

    @GET("/api/search/youtube")
    suspend fun searchByQuery(@Query("search_query") query: String): Response<String>

    @GET("/api/video/trending")
    suspend fun getTrending(): Response<String>

    @GET("/api/video/music")
    suspend fun getMusic(): Response<String>

    companion object {
        const val URL = "http://192.168.1.25:3333/api/video/youtube/"
    }
}
