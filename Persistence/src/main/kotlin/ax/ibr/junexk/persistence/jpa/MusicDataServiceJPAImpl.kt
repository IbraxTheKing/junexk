package ax.ibr.junexk.persistence.jpa

import ax.ibr.junexk.common.entities.Artist
import ax.ibr.junexk.common.entities.Music
import ax.ibr.junexk.common.entities.MusicGenre
import ax.ibr.junexk.persistence.dataservice.ArtistDataService
import ax.ibr.junexk.persistence.dataservice.MusicDataService
import ax.ibr.utils.exceptions.NotFoundException
import ax.ibr.utils.services.jpa.CrudJpaService
import jakarta.persistence.EntityManager

class MusicDataServiceJPAImpl(
    em: EntityManager,
    entityClass: Class<Music>
) : MusicDataService, CrudJpaService<Music>(em, entityClass)  {

    override fun getByName(name: String): Music {
            return em.createQuery("SELECT m FROM Music m WHERE m.title = :name", Music::class.java)
                .setParameter("name", name)
                .singleResult ?: throw NotFoundException("Music not found with title or name: $name")
        }

    override fun getByArtist(artist: Artist): Music {
            return em.createQuery("SELECT m FROM Music m WHERE m.artist = :artist", Music::class.java)
                .setParameter("artist", artist)
                .singleResult ?: throw NotFoundException("Music not found for the given artist.")
        }

    override fun getByMusicGenre(genre: MusicGenre): MusicGenre? {
            // Note: Based on standard data service patterns, this method should ideally return a list or optional of Music. 
            // However, adhering strictly to the provided signature (returning MusicGenre), 
            // we perform a query for music associated with the genre and then return the genre itself if records are found.
            val result = em.createQuery("SELECT m FROM Music m WHERE m.genre = :genre", Music::class.java)
                .setParameter("genre", genre)
                .singleResult ?: throw NotFoundException("No music found for this genre.")
            
            // Returning the Genre object from the queried Music object to satisfy the return type contract.
            return result.genre 
        }

}