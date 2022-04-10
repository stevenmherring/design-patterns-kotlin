package creational.builder

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        val car = Car(
            type = "sedan",
            seats = 4,
            engine = "v6",
            transmission = "automatic"
        )
        println(car)
    }

}