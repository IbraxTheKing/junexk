package ax.ibr.junexk.common.services

import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.PlaylistType
import ax.ibr.utils.services.CrudService

interface PlaylistService : CrudService<Playlist> {
    fun getByMusic(music: Music): Playlist
    fun getByName(name: String): Playlist
    fun getByType(type: PlaylistType): List<Playlist>
}