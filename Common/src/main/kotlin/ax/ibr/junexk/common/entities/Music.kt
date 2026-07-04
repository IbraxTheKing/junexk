package ax.ibr.junexk.common.entities

import java.util.Date

class Music {
    var title: String? = null
    var artists: List<Artist>? = null
    var duration: Int? = null
    var genre: MusicGenre? = null
    var releaseDate: Date? = null

    var isPrivate: Boolean? = null

}