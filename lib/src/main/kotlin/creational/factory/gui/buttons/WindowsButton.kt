package creational.factory.gui.buttons

import javax.swing.*
import java.awt.*
import kotlin.system.exitProcess

class WindowsButton : Button {
    private val panel = JPanel()
    private val frame = JFrame()
    private lateinit var button: JButton

    override fun render() {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val label = JLabel("Hello World!")
        label.apply {
            isOpaque = true
            background = Color(235, 233, 126)
            font = Font("Dialog", Font.BOLD, 44)
            horizontalAlignment = SwingConstants.CENTER
            layout = FlowLayout(FlowLayout.CENTER)
        }
        frame.contentPane.add(panel)
        panel.add(label)
        onClick()
        panel.add(button)

        frame.apply {
            size = Dimension(320, 200)
            isVisible = true
        }
        onClick()
    }

    override fun onClick() {
        button = JButton("Exit")
        button.addActionListener {
            frame.isVisible = false
            exitProcess(0)
        }
    }

}