package creational.factory.gui

import creational.factory.gui.buttons.Button

abstract class Dialog {
    fun renderWindow() {
        val okButton = createButton()
        okButton.render()
    }

    abstract fun createButton(): Button
}