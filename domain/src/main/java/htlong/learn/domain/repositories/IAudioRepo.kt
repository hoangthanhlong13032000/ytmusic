package htlong.learn.domain.repositories

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.entities.AudioQuery

interface IAudioRepo {
    suspend fun queryTrending(): AudioQuery
    suspend fun queryMusic(): AudioQuery
    suspend fun querySport(): AudioQuery
    suspend fun queryGaming(): AudioQuery
    suspend fun searchOnline(query: String): AudioQuery

    suspend fun getByID(id: String): Audio?
    suspend fun save(audio: Audio): Boolean
    suspend fun unSave(audio: Audio): Boolean
    suspend fun getAllSaved(): ArrayList<Audio>
    suspend fun deleteAllSaved(): Int
    suspend fun download(audio: Audio, path: String): Boolean
    suspend fun searchOffline(query: String): ArrayList<Audio>

    suspend fun favourite(audioDetail: AudioDetail): Boolean
    suspend fun unFavourite(id: String): Boolean
    suspend fun getAllFavourite(): ArrayList<AudioDetail>
    suspend fun searchFavourite(query: String): ArrayList<AudioDetail>
}