package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.User
import ax.ibr.junexk.persistence.dataservice.UserDataService
import ax.ibr.utils.exceptions.NotFoundException
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class UserDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<User>
) : UserDataService, CrudJpaService<User>(em, entityClass)  {

    override fun getByName(name: String): User {
        return em.createQuery("SELECT u FROM User u WHERE u.name = :name", User::class.java)
            .setParameter("name", name)
            .singleResult ?: throw NotFoundException("User not found with the given name.")
    }

    override fun getByPlaylist(playlist: Playlist): User {
        return em.createQuery("SELECT p.owner FROM Playlist p WHERE p = :playlist", User::class.java) // Placeholder assumption based on standard JPA practice (getting owner from associated entity).
            .setParameter("playlist", playlist)
            .singleResult ?: throw NotFoundException("User ownership not found for the given playlist.")
    }
}