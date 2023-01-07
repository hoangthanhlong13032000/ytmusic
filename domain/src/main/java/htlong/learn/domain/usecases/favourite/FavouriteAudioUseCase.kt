package htlong.learn.domain.usecases.favourite

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.repositories.IAudioRepo

class FavouriteAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(audioDetail: AudioDetail): Boolean = audioRepo.favourite(audioDetail = audioDetail)
}