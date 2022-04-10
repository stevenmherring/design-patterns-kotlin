package creational.abstract.factory.gui.factories

import creational.abstract.factory.gui.buttons.Button
import creational.abstract.factory.gui.buttons.WindowsButton
import creational.abstract.factory.gui.checkboxes.Checkbox
import creational.abstract.factory.gui.checkboxes.WindowsCheckbox

class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}