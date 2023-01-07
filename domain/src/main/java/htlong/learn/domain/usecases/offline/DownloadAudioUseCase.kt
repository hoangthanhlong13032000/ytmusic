package htlong.learn.domain.usecases.offline

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.repositories.IAudioRepo

class DownloadAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(audio: Audio, path: String): Boolean = audioRepo.download(audio = audio, path = path)
}