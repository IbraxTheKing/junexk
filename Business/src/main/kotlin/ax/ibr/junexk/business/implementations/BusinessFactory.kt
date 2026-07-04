package ax.ibr.junexk.business.implementations

import ax.ibr.junexk.common.services.ArtistService
import ax.ibr.junexk.common.services.MusicService
import ax.ibr.junexk.common.services.PlaylistService
import ax.ibr.junexk.common.services.UserService

class BusinessFactory {

    private lateinit var artistSrv: ArtistService
    private lateinit var playlistSrv: PlaylistService
    private lateinit var musicSrv: MusicService
    private lateinit var userSrv: UserService

    fun getArtistService(): ArtistService {
        if (!::artistSrv.isInitialized) {
            artistSrv = ArtistServiceImpl()
        }
        return artistSrv
    }

    fun getPlaylistService(): PlaylistService {
        if (!::playlistSrv.isInitialized) {
            playlistSrv = PlaylistServiceImpl()
        }
        return playlistSrv
    }

    fun getMusicService(): MusicService {
        if (!::musicSrv.isInitialized) {
            musicSrv = MusicServiceImpl()
        }
        return musicSrv
    }

    fun getUserService(): UserService {
        if (!::userSrv.isInitialized) {
            userSrv = UserServiceImpl()
        }
        return userSrv
    }
}