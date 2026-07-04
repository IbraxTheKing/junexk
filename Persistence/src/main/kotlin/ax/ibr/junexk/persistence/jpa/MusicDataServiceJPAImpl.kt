package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.MusicGenre
import ax.ibr.junexk.persistence.dataservice.ArtistDataService
import ax.ibr.junexk.persistence.dataservice.MusicDataService
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class MusicDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<Music>
) : MusicDataService, CrudJpaService<Music>(em, entityClass)  {

    override fun getByName(name: String): Music {
        TODO("Not yet implemented")
    }

    override fun getByArtist(artist: Artist): Music {
        TODO("Not yet implemented")
    }

    override fun getByMusicGenre(genre: MusicGenre): MusicGenre {
        TODO("Not yet implemented")
    }

}