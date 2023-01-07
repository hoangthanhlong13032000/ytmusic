package htlong.learn.domain.usecases.online

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.repositories.IAudioRepo

class GetAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(id: String): Audio? = audioRepo.getByID(id = id)
}