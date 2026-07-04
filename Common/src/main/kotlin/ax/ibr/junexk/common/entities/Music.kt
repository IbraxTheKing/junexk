package ax.ibr.junexk.common.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.Date

@Entity
open class Music {
    @Id
    var id: Long? = null
    var title: String? = null
    var artists: List<Artist>? = null
    var duration: Int? = null
    var genre: MusicGenre? = null
    var releaseDate: Date? = null

    var isPrivate: Boolean? = null

}