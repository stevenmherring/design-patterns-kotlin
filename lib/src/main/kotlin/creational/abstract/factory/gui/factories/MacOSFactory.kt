package creational.abstract.factory.gui.factories

import creational.abstract.factory.gui.buttons.Button
import creational.abstract.factory.gui.buttons.MacOSButton
import creational.abstract.factory.gui.checkboxes.Checkbox
import creational.abstract.factory.gui.checkboxes.MacOSCheckbox

class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacOSCheckbox()
    }
}