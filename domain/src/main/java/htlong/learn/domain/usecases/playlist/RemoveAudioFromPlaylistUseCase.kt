package htlong.learn.domain.usecases.playlist

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.repositories.IPlaylistRepo

class RemoveAudioFromPlaylistUseCase(private val playlistRepo: IPlaylistRepo) {
    suspend operator fun invoke(id: String, audioDetail: AudioDetail): Boolean = playlistRepo.removeAudio(id = id, audioDetail = audioDetail)
}