package creational.singleton

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        val serviceA = DAOService
        val serviceB = DAOService
        if (serviceA == serviceB) {
            println("They are the same!")
        }
    }
}