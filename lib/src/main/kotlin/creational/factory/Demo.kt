package creational.factory

import creational.factory.gui.Dialog
import creational.factory.gui.HtmlDialog
import creational.factory.gui.WindowsDialog

object Demo {
    @JvmStatic
    private var dialog: Dialog? = null

    @JvmStatic
    fun main(args: Array<String>) {
        configure()
        runBusinessLogic()
    }

    @JvmStatic
    fun configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            this.dialog = WindowsDialog()
        } else {
            this.dialog = HtmlDialog()
        }
    }

    @JvmStatic
    fun runBusinessLogic() = this.dialog?.renderWindow()
}