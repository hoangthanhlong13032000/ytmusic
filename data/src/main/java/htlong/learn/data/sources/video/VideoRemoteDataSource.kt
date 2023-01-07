package htlong.learn.data.sources.video

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import htlong.learn.data.common.Utils
import htlong.learn.data.entities.ApiResponse
import htlong.learn.data.helpers.NetworkHelper
import htlong.learn.data.remote.services.VideoService
import htlong.learn.domain.entities.Audio
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.enums.TrendingType

class VideoRemoteDataSource private constructor() : IAudioDataSource.Remote {
    private val videoService = NetworkHelper.createService(VideoService.URL, VideoService::class.java)

    override suspend fun getByID(id: String): Audio? {
        var result: Audio? = null
        try {
            videoService.searchByID(id = id).body()?.let {
                val gson = Gson()
                val audioResponse = gson.fromJson(it, ApiResponse::class.java)
                if (audioResponse.isSuccess()) {
                    result = gson.fromJson(audioResponse.data, Audio::class.java)
                }
            }
        } catch (e: Exception) {
            Utils.handleException("video_id_$id", e)
        }
        return result
    }

    override suspend fun search(q: String): AudioQuery {
        val result = AudioQuery(query = q, suggests = arrayListOf())
        try {
            val gson = Gson()
            videoService.searchByQuery(query = q).body()?.let {
                val videoResponse = gson.fromJson(it, ApiResponse::class.java)
                if (videoResponse.isSuccess()) {
                    result.suggests = gson.fromJson(videoResponse.data, object : TypeToken<ArrayList<AudioDetail>>() {}.type)
                }
            }
        } catch (e: Exception) {
            Utils.handleException("video_search", e)
        }
        return result
    }

    override suspend fun getTrending(type: TrendingType): AudioQuery {
        val result = AudioQuery(query = "", suggests = arrayListOf())
        try {
            val gson = Gson()
            val body = when (type) {
                TrendingType.NOW -> videoService.getNowTrending().body()
                TrendingType.MUSIC -> videoService.getMusicTrending().body()
                TrendingType.GAMING -> videoService.getGamingTrending().body()
                TrendingType.SPORT -> videoService.getSportTrending().body()
            }
            val videoResponse = gson.fromJson(body, ApiResponse::class.java)
            if (videoResponse.isSuccess()) {
                result.suggests = gson.fromJson(videoResponse.data, object : TypeToken<ArrayList<AudioDetail>>() {}.type)
            }
        } catch (e: Exception) {
            Utils.handleException("video_${type.name}_trending", e)
        }
        return result
    }


    companion object {
        private var instance: VideoRemoteDataSource? = null
        fun getInstance() = instance ?: VideoRemoteDataSource().also { instance = it }
    }
}