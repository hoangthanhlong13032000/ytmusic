package htlong.learn.data.sources.video.remote

import com.google.gson.Gson
import htlong.learn.domain.entities.ResponseEntities
import htlong.learn.data.sources.video.IVideoDataSource
import htlong.learn.data.api.VideoClient
import htlong.learn.youtube.utils.Enums
import htlong.learn.youtube.utils.Utils

class VideoRemoteDataSource private constructor(): IVideoDataSource.Remote {
    override suspend fun search(q: String): ResponseEntities.Search {
        return try {
            val res = VideoClient.youtube.search(query = q)
            Gson().fromJson(res.body() ?: res.errorBody()?.string(), ResponseEntities.Search::class.java)
        } catch (e: Exception) {
            Utils.handleException("suggest_query", e)
            ResponseEntities.Search(status = 0, data = emptyList(), e.localizedMessage ?: "")
        }
    }

    override suspend fun getByType(type: Enums.VideoType): ResponseEntities.Search {
        TODO("Not yet implemented")
    }

    override suspend fun getByID(id: String): ResponseEntities.Video {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: VideoRemoteDataSource? = null
        fun getInstance() = instance ?: VideoRemoteDataSource().also { instance = it }
    }
}