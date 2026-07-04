package ax.ibr.junexk.business.implementations

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.MusicGenre
import ax.ibr.junexk.common.services.MusicService
import ax.ibr.junexk.persistence.dataservice.PersistenceFactory

class MusicServiceImpl : MusicService {

    private val service : MusicService = PersistenceFactory().getMusicService()

    override fun getByName(name: String): Music {
        return service.getByName(name)
    }

    override fun getByArtist(artist: Artist): Music {
        return service.getByArtist(artist)
    }

    override fun getByMusicGenre(genre: MusicGenre): MusicGenre {
        return service.getByMusicGenre(genre)
    }

    override fun add(t: Music) {
        service.add(t)
    }

    override fun update(t: Music) {
        service.update(t)
    }

    override fun remove(t: Music) {
        service.remove(t)
    }

    override fun getAll(): List<Music> {
        return service.getAll()
    }

    override fun getById(id: Long): Music? {
        return service.getById(id)
    }
}