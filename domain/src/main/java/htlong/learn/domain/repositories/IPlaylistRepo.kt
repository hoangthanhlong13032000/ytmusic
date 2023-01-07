package htlong.learn.domain.repositories

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.entities.Playlist

interface IPlaylistRepo {
    suspend fun create(name: String, desc: String): Playlist
    suspend fun getAll(): ArrayList<Playlist>
    suspend fun getByID(id: String): Playlist?
    suspend fun addAudio(id: String, audioDetail: AudioDetail): Boolean
    suspend fun removeAudio(id: String, audioDetail: AudioDetail): Boolean
    suspend fun delete(id: String): Boolean
}