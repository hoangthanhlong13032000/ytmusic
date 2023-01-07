package htlong.learn.domain.usecases.favourite

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.repositories.IAudioRepo

class GetFavouriteAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(): ArrayList<AudioDetail> = audioRepo.getAllFavourite()
}