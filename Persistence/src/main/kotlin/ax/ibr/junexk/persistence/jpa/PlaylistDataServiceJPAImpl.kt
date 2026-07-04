package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.PlaylistType
import ax.ibr.junexk.persistence.dataservice.PlaylistDataService
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class PlaylistDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<Playlist>
) : PlaylistDataService, CrudJpaService<Playlist>(em, entityClass)  {

    override fun getByMusic(music: Music): Playlist {
        TODO("Not yet implemented")
    }

    override fun getByName(name: String): Playlist {
        TODO("Not yet implemented")
    }

    override fun getByType(type: PlaylistType): List<Playlist> {
        TODO("Not yet implemented")
    }
}