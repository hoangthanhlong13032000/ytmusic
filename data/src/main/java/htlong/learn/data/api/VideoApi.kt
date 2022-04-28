package htlong.learn.data.sources.video.remote.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoApi {
    @GET("/api/video/youtube")
    suspend fun getByID(@Query("id") id: String): Response<String>

    @GET("/api/search/youtube")
    suspend fun search(@Query("search_query") query: String): Response<String>

    @GET("/api/video/trending")
    suspend fun getTrending(): Response<String>

    @GET("/api/video/music")
    suspend fun getMusic(): Response<String>

    @GET("/api/video/movie")
    suspend fun getMovie(): Response<String>

    @GET("/api/video/gaming")
    suspend fun getGaming(): Response<String>
}
