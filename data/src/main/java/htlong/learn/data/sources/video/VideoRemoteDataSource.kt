package htlong.learn.data.sources.video

import com.google.gson.Gson
import htlong.learn.data.helpers.NetworkHelper
import htlong.learn.data.api.VideoApi
import htlong.learn.data.common.Utils
import htlong.learn.data.entities.ApiResponse
import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery

class VideoRemoteDataSource private constructor() : IVideoDataSource.Remote {
    private val videoApi = NetworkHelper.createApi(VideoApi.URL, VideoApi::class.java)

    override suspend fun getByID(id: String): VideoEntities.Info {
        TODO("Not yet implemented")
    }


    override suspend fun search(q: String): VideoQuery {
        val result = VideoQuery(query = q)
        val gson = Gson()

        try {
            videoApi.searchByQuery(query = q).body()?.let {
                val body = gson.fromJson(it, ApiResponse.VideoSearched::class.java)
                result.suggests = body.data
            }
        } catch (e: Exception) {
            Utils.handleException("video_search", e)
        }

        return result
    }


    override suspend fun save(video: VideoEntities.Info) {
        TODO("Not yet implemented")
    }


    companion object {
        private var instance: VideoRemoteDataSource? = null
        fun getInstance() = instance ?: VideoRemoteDataSource().also { instance = it }
    }
}