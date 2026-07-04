package ax.ibr.junexk.common.services

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.utils.services.CrudService

interface ArtistService : CrudService<Artist> {
    fun getByMusic(music: Music): Artist
}