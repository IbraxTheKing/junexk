package ax.ibr.junexk.business.implementations

import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.User
import ax.ibr.junexk.common.services.UserService
import ax.ibr.junexk.persistence.dataservice.PersistenceFactory

class UserServiceImpl : UserService {

    private var service: UserService = PersistenceFactory().getUserService()

    override fun getByName(name: String): User {
        return service.getByName(name)
    }

    override fun getByPlaylist(playlist: Playlist): User {
        return service.getByPlaylist(playlist)
    }

    override fun add(t: User) {
        service.add(t)
    }

    override fun update(t: User) {
        service.update(t)
    }

    override fun remove(t: User) {
        service.remove(t)
    }

    override fun getAll(): List<User> {
        return service.getAll()
    }

    override fun getById(id: Long): User? {
        return service.getById(id)
    }
}