package creational.factory.gui

import creational.factory.gui.buttons.Button
import creational.factory.gui.buttons.HtmlButton

class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}