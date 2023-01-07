package htlong.learn.domain.usecases.history

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.repositories.IAudioRepo

class SaveHistoryAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(audio: Audio) = audioRepo.save(audio = audio)
}