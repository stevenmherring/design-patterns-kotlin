package creational.factory.gui

import creational.factory.gui.buttons.Button
import creational.factory.gui.buttons.WindowsButton

class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}