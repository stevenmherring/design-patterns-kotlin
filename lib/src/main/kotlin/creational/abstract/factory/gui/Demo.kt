package creational.abstract.factory.gui

import creational.abstract.factory.gui.factories.GUIFactory
import creational.abstract.factory.gui.factories.MacOSFactory
import creational.abstract.factory.gui.factories.WindowsFactory
import java.util.*

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        val app: App = configureApp()
        app.paint()
    }

    @JvmStatic
    fun configureApp(): App {
        val factory: GUIFactory
        val os = System.getProperty("os.name").lowercase(Locale.getDefault())
        factory = if (os.contains("mac")) {
            MacOSFactory()
        } else {
            WindowsFactory()
        }
        return App(factory)
    }
}