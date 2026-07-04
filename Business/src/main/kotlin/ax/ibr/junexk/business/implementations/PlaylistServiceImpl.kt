package ax.ibr.junexk.business.implementations

import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.PlaylistType
import ax.ibr.junexk.common.services.PlaylistService
import ax.ibr.junexk.persistence.dataservice.PersistenceFactory
import jakarta.persistence.Persistence

class PlaylistServiceImpl : PlaylistService {

    private val service: PlaylistService = PersistenceFactory().getPlaylistService()

    override fun getByMusic(music: Music): Playlist {
        return service.getByMusic(music)
    }

    override fun getByName(name: String): Playlist {
        return service.getByName(name)
    }

    override fun getByType(type: PlaylistType): List<Playlist> {
        return service.getByType(type)
    }

    override fun add(t: Playlist) {
        service.add(t)
    }

    override fun update(t: Playlist) {
        service.update(t)
    }

    override fun remove(t: Playlist) {
        service.remove(t)
    }

    override fun getAll(): List<Playlist> {
        return service.getAll()
    }

    override fun getById(id: Long): Playlist? {
        return service.getById(id)
    }
}