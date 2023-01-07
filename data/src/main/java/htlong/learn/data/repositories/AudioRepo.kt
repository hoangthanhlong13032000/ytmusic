package htlong.learn.data.repositories

import htlong.learn.data.sources.video.IAudioDataSource
import htlong.learn.domain.entities.Audio
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.domain.repositories.IAudioRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AudioRepo private constructor(
    private val audioRemoteDS: IAudioDataSource.Remote,
    private val audioLocalDS: IAudioDataSource.Local,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : IAudioRepo {

    override suspend fun queryTrending(): AudioQuery {
        return withContext(dispatcher) {
            audioRemoteDS.getTrending(type = TrendingType.NOW)
        }
    }

    override suspend fun queryMusic(): AudioQuery {
        return withContext(dispatcher) {
            audioRemoteDS.getTrending(type = TrendingType.MUSIC)
        }
    }

    override suspend fun querySport(): AudioQuery {
        return withContext(dispatcher) {
            audioRemoteDS.getTrending(type = TrendingType.SPORT)
        }
    }

    override suspend fun queryGaming(): AudioQuery {
        return withContext(dispatcher) {
            audioRemoteDS.getTrending(type = TrendingType.GAMING)
        }
    }

    override suspend fun searchOnline(query: String): AudioQuery {
        return withContext(dispatcher) {
            audioRemoteDS.search(q = query);
        }
    }

    override suspend fun getByID(id: String): Audio? {
        return withContext(dispatcher) {
            audioRemoteDS.getByID(id = id)
        }
    }

    override suspend fun save(audio: Audio): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun unSave(audio: Audio): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getAllSaved(): ArrayList<Audio> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllSaved(): Int {
        TODO("Not yet implemented")
    }

    override suspend fun download(audio: Audio, path: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun searchOffline(query: String): ArrayList<Audio> {
        TODO("Not yet implemented")
    }

    override suspend fun favourite(audioDetail: AudioDetail): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun unFavourite(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getAllFavourite(): ArrayList<AudioDetail> {
        TODO("Not yet implemented")
    }

    override suspend fun searchFavourite(query: String): ArrayList<AudioDetail> {
        TODO("Not yet implemented")
    }

    companion object {
        private var instance: AudioRepo? = null
        fun getInstance(
            videoRemoteDS: IAudioDataSource.Remote,
            videoLocalDS: IAudioDataSource.Local,
        ) = instance ?: AudioRepo(videoRemoteDS, videoLocalDS).also { instance = it }
    }
}