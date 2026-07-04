package ax.ibr.junexk.common.services

import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.User
import ax.ibr.utils.services.CrudService

interface UserService : CrudService<User> {
    fun getByName(name: String): User
    fun getByPlaylist(playlist: Playlist): User

}