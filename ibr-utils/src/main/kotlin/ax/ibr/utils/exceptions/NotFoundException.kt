package ax.ibr.utils.exceptions


/**
 * Exception thrown when a resource or entity that is expected to exist cannot be located.
 *
 * This exception should be used to signal that an operation failed because the requested
 * data does not correspond to any record in the system.
 *
 * The calling layer (e.g., API gateway or REST controller) should handle this exception
 * and typically translate it into an HTTP 404 Not Found response.
 *
 * @param message description of the resource that was not found.
 *
 * @author ib
 * @since 1.0
 */
class NotFoundException(message: String) :
    Exception(message) {
}