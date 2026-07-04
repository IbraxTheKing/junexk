package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.User
import ax.ibr.junexk.persistence.dataservice.UserDataService
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class UserDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<User>
) : UserDataService, CrudJpaService<User>(em, entityClass)  {

    override fun getByName(name: String): User {
        TODO("Not yet implemented")
    }

    override fun getByPlaylist(playlist: Playlist): User {
        TODO("Not yet implemented")
    }
}