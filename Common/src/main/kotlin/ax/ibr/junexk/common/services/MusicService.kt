package ax.ibr.junexk.common.services

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.MusicGenre
import ax.ibr.utils.services.CrudService

interface MusicService : CrudService<Music> {
    fun getByName(name: String): Music
    fun getByArtist(artist: Artist): Music
    fun getByMusicGenre(genre: MusicGenre): MusicGenre
}