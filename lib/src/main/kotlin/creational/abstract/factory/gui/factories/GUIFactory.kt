package creational.abstract.factory.gui.factories

import creational.abstract.factory.gui.buttons.Button
import creational.abstract.factory.gui.checkboxes.Checkbox

abstract interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}