package htlong.learn.youtube.data.source.video.remote

import com.google.gson.Gson
import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.data.source.video.IVideoDataSource
import htlong.learn.youtube.data.source.video.remote.api.VideoClient
import htlong.learn.youtube.utils.Enums
import htlong.learn.youtube.utils.Utils

class VideoRemoteDataSource private constructor(): IVideoDataSource.Remote {
    override suspend fun search(q: String): ApiResponse.Search {
        return try {
            val res = VideoClient.youtube.search(query = q)
            Gson().fromJson(res.body() ?: res.errorBody()?.string(), ApiResponse.Search::class.java)
        } catch (e: Exception) {
            Utils.handleException("suggest_query", e)
            ApiResponse.Search(status = 0, data = emptyList(), e.localizedMessage ?: "")
        }
    }

    override suspend fun getByType(type: Enums.VideoType): ApiResponse.Search {
        TODO("Not yet implemented")
    }

    override suspend fun getByID(id: String): ApiResponse.Video {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: VideoRemoteDataSource? = null
        fun getInstance() = instance ?: VideoRemoteDataSource().also { instance = it }
    }
}