package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.persistence.dataservice.ArtistDataService
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class ArtistDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<Artist>
) : ArtistDataService, CrudJpaService<Artist>(em, entityClass)  {

    override fun getByMusic(music: Music): Artist {
        TODO("Not yet implemented")
    }
}