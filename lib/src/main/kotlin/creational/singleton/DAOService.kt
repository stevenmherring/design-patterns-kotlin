package creational.singleton

/**
 * Simplifying actually creating some connection somewhere
 * Singletons are made easy in Kotlin with object type
 */
object DAOService {
    private val connection = Connection("Healthy")

    @JvmStatic
    fun checkConnection() {
        println(connection.checkStatus())
    }
}

class Connection(private val status: String = "Healthy") {
    fun checkStatus(): String {
        return status
    }
}