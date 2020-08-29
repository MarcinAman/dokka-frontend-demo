import components.rootComponent
import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.get
import react.child

fun main() {
    window.onload = {
        render(document.getElementsByTagName("body")[0]) {
            child(rootComponent)
        }
    }
}
