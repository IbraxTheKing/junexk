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
        TODO("Not yet implemented")
    }

    override fun getByMusicGenre(genre: MusicGenre): MusicGenre {
        TODO("Not yet implemented")
    }

    override fun add(t: Music) {
        TODO("Not yet implemented")
    }

    override fun update(t: Music) {
        TODO("Not yet implemented")
    }

    override fun remove(t: Music) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Music> {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): Music? {
        TODO("Not yet implemented")
    }
}