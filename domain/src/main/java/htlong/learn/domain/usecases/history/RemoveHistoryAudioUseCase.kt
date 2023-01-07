package htlong.learn.domain.usecases.history

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.repositories.IAudioRepo

class RemoveHistoryAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(): Int = audioRepo.deleteAllSaved()
    suspend operator fun invoke(audio: Audio): Boolean = audioRepo.unSave(audio = audio)
}