package creational.abstract.factory.gui

import creational.abstract.factory.gui.buttons.Button
import creational.abstract.factory.gui.checkboxes.Checkbox
import creational.abstract.factory.gui.factories.GUIFactory

class App(factory: GUIFactory) {
    lateinit var button: Button
    lateinit var checkbox: Checkbox

    init {
        button = factory.createButton()
        checkbox = factory.createCheckbox()
    }

    fun paint() {
        button.paint()
        checkbox.paint()
    }
}