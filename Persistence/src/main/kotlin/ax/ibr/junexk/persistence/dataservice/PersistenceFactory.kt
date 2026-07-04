package ax.ibr.junexk.persistence.dataservice

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.Playlist
import ax.ibr.junexk.common.entities.User
import ax.ibr.junexk.persistence.jpa.ArtistDataServiceJPAImpl
import ax.ibr.junexk.persistence.jpa.MusicDataServiceJPAImpl
import ax.ibr.junexk.persistence.jpa.PlaylistDataServiceJPAImpl
import ax.ibr.junexk.persistence.jpa.UserDataServiceJPAImpl
import jakarta.persistence.EntityManager
import jakarta.persistence.Persistence

class PersistenceFactory {

    private lateinit var artistService : ArtistDataService

    private lateinit var musicService : MusicDataService

    private lateinit var userService : UserDataService

    private lateinit var playlistService : PlaylistDataService

    private val PU : String = "junexPU"
    private val JDBC : Boolean = false

    private val entityManager: EntityManager by lazy {
        Persistence.createEntityManagerFactory(PU).createEntityManager()
    }

    fun getArtistService() : ArtistDataService {

        if (!::artistService.isInitialized) {
            if (!JDBC) {
                artistService = ArtistDataServiceJPAImpl(entityManager, Artist::class.java)
            }
        }
        return artistService
    }

    fun getMusicService() : MusicDataService {

        if (!::musicService.isInitialized) {
            if (!JDBC) {
                musicService = MusicDataServiceJPAImpl(entityManager, Music::class.java)
            }
        }
        return musicService
    }

    fun getUserService() : UserDataService {
        if (!::userService.isInitialized) {
            if (!JDBC) {
                userService = UserDataServiceJPAImpl(entityManager, User::class.java)
            }
        }
        return userService
    }

    fun getPlaylistService() : PlaylistDataService {
        if (!::playlistService.isInitialized) {
            if (!JDBC) {
                playlistService = PlaylistDataServiceJPAImpl(entityManager, Playlist::class.java)
            }
        }
        return playlistService
    }

}