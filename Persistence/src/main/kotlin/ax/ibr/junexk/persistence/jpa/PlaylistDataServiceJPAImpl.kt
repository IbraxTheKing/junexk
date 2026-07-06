package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.PlaylistType
import ax.ibr.junexk.persistence.dataservice.PlaylistDataService
import ax.ibr.utils.exceptions.NotFoundException
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class PlaylistDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<Playlist>
) : PlaylistDataService, CrudJpaService<Playlist>(em, entityClass)  {

    override fun getByMusic(music: Music): Playlist {
        return em.createQuery("SELECT p FROM Playlist p WHERE p.music = :music", Playlist::class.java)
            .setParameter("music", music)
            .singleResult ?: throw NotFoundException("Playlist not found for the given music.")
    }

    override fun getByName(name: String): Playlist {
        return em.createQuery("SELECT p FROM Playlist p WHERE p.name = :name", Playlist::class.java)
            .setParameter("name", name)
            .singleResult ?: throw NotFoundException("Playlist not found with the given name.")
    }

    override fun getByType(type: PlaylistType): List<Playlist> {
        return em.createQuery("SELECT p FROM Playlist p WHERE p.type = :type", Playlist::class.java)
            .setParameter("type", type)
            .resultList
    }
}