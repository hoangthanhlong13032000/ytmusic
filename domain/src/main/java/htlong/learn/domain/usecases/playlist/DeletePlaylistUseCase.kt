package htlong.learn.domain.usecases.playlist

import htlong.learn.domain.repositories.IPlaylistRepo

class DeletePlaylistUseCase(private val playlistRepo: IPlaylistRepo) {
    suspend operator fun invoke(id: String): Boolean = playlistRepo.delete(id = id)
}