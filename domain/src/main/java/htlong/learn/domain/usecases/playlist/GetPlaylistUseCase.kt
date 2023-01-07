package htlong.learn.domain.usecases.playlist

import htlong.learn.domain.entities.Playlist
import htlong.learn.domain.repositories.IPlaylistRepo

class GetPlaylistUseCase(private val playlistRepo: IPlaylistRepo) {
    suspend operator fun invoke(): ArrayList<Playlist> = playlistRepo.getAll()
    suspend operator fun invoke(id: String): Playlist? = playlistRepo.getByID(id = id)
}