package ax.ibr.junexk.common.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity
open class Playlist {
    @Id
    var id: Long? = null
    @ManyToOne
    @JoinColumn(name = "owner_id")
    var owner: User? = null
    var duration: Int? = null
    var genre: MusicGenre? = null

    var releaseDate: Date? = null
    var artists: List<Artist>? = null

    var songs: List<Music>? = null
    var type: PlaylistType? = null

    var isPrivate: Boolean? = null

}