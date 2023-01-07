package htlong.learn.domain.usecases.favourite

import htlong.learn.domain.repositories.IAudioRepo

class UnFavouriteAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(id: String): Boolean = audioRepo.unFavourite(id = id)
}