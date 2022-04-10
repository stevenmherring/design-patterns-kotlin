package creational.builder

/**
 * Builder classes aren't really necessary in Kotlin
 * Data classes handle what you need out of builders
 * Because I'm lazy, everything is a String and not enums :)
 */
data class Car(
    private val type: String = "coupe",
    private val seats: Int = 2,
    private val engine: String = "v8",
    private val transmission: String = "manual",
    private val color: String = "black"
)
