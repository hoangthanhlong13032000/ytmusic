package htlong.learn.data.sources.video

import com.google.gson.Gson
import htlong.learn.data.api.VideoApi
import htlong.learn.data.common.Utils
import htlong.learn.data.entities.ApiResponse
import htlong.learn.data.helpers.NetworkHelper
import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType

class VideoRemoteDataSource private constructor() : IVideoDataSource.Remote {
    private val videoApi = NetworkHelper.createApi(VideoApi.URL, VideoApi::class.java)

    override suspend fun getByID(id: String): VideoEntities.Info? {
        return try {
            videoApi.searchByID(id = id).body()?.let {
                val videoResponse = Gson().fromJson(it, ApiResponse.Video::class.java)
                videoResponse.data
            }
        } catch (e: Exception) {
            Utils.handleException("video_id_$id", e)
            null
        }
    }

    override suspend fun search(q: String): VideoQuery {
        val result = VideoQuery(query = q)
        try {
            videoApi.searchByQuery(query = q).body()?.let {
                val videoResponse = Gson().fromJson(it, ApiResponse.VideoSearched::class.java)
                result.suggests = videoResponse.data
            }
        } catch (e: Exception) {
            Utils.handleException("video_search", e)
        }
        return result
    }

    override suspend fun getTrending(type: TrendingType): VideoQuery {
        val result = VideoQuery(query = "")
        try {
            val body = when (type) {
                TrendingType.NOW -> videoApi.getNowTrending().body()
                TrendingType.MUSIC -> videoApi.getMusicTrending().body()
                TrendingType.GAMING -> videoApi.getGamingTrending().body()
                TrendingType.SPORT -> videoApi.getSportTrending().body()

            }
            val videoResponse = Gson().fromJson(body, ApiResponse.VideoSearched::class.java)
            result.suggests = videoResponse.data
        } catch (e: Exception) {
            Utils.handleException("video_${type.name}_trending", e)
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