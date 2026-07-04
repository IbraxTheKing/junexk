package ax.ibr.junexk.business.implementations

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.services.ArtistService
import ax.ibr.junexk.persistence.dataservice.PersistenceFactory

class ArtistServiceImpl : ArtistService {

    private val service: ArtistService = PersistenceFactory().getArtistService()

    override fun getByMusic(music: Music): Artist {
        return service.getByMusic(music)
    }

    override fun add(t: Artist) {
        service.add(t)
    }

    override fun update(t: Artist) {
        service.update(t)
    }

    override fun remove(t: Artist) {
        service.remove(t)
    }

    override fun getAll(): List<Artist> {
        return service.getAll()
    }

    override fun getById(id: Long): Artist? {
        return service.getById(id)
    }

}