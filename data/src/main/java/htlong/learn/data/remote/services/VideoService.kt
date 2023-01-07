package htlong.learn.data.remote.services

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoService {
    @GET("/api/video/youtube")
    suspend fun searchByID(@Query("id") id: String): Response<String>

    @GET("/api/search/youtube")
    suspend fun searchByQuery(@Query("search_query") query: String): Response<String>

    @GET("/api/search/youtube/music")
    suspend fun getMusicTrending(): Response<String>

    @GET("/api/search/youtube/trending")
    suspend fun getNowTrending(): Response<String>

    @GET("/api/search/youtube/gaming")
    suspend fun getGamingTrending(): Response<String>

    @GET("/api/search/youtube/sport")
    suspend fun getSportTrending(): Response<String>

    companion object {
        const val URL = "http://192.168.1.25:3333"
    }
}
