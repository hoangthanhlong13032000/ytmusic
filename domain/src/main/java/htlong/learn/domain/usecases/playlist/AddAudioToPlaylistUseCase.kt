package htlong.learn.domain.usecases.playlist

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.repositories.IPlaylistRepo

class AddAudioToPlaylistUseCase(private val playlistRepo: IPlaylistRepo) {
    suspend operator fun invoke(id: String, audioDetail: AudioDetail): Boolean = playlistRepo.addAudio(id = id, audioDetail = audioDetail)
}