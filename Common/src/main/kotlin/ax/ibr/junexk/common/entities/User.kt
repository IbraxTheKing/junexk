package ax.ibr.junexk.common.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity
open class User {
    @Id
    open var id: Long? = null
    var name: String? = null
    var age: Int? = null
    var gender: Int? = null
    var description: String? = null
    var avatar: String? = null

    @ManyToOne
    @JoinColumn(name = "liked_playlist_id")
    var likedPlaylist: Playlist? = null

    var playlists: List<Playlist>? = null


    var username: String? = null
    var password: String? = null
    var email: String? = null
    var createdAt: Date? = null

}