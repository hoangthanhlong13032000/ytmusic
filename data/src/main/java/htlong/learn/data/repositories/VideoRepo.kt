package htlong.learn.data.repositories

import htlong.learn.data.sources.video.IVideoDataSource
import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.domain.repositories.IVideoRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoRepo private constructor(
    private val videoRemoteDS: IVideoDataSource.Remote,
    private val videoLocalDS: IVideoDataSource.Local,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : IVideoRepo {

    override suspend fun getByID(id: String): VideoEntities.Info {
        TODO("Not yet implemented")
    }

    override suspend fun getTrending(type: TrendingType): VideoQuery {
        return withContext(dispatcher) { videoRemoteDS.getTrending(type) }
    }

    override suspend fun search(query: String): VideoQuery {
        return withContext(dispatcher) { videoRemoteDS.search(query) }
    }

    override suspend fun save(video: VideoEntities.Info) {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: VideoRepo? = null
        fun getInstance(
            videoRemoteDS: IVideoDataSource.Remote,
            videoLocalDS: IVideoDataSource.Local,
        ) = instance ?: VideoRepo(videoRemoteDS, videoLocalDS).also { instance = it }
    }
}