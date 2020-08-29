package components.leftNavigation

import kotlinx.html.unsafe
import react.RProps
import react.dom.div
import react.functionalComponent

val logoComponent = functionalComponent<RProps> {
    div {
        attrs["id"] = "logo"
        attrs.unsafe { raw(logo) }
    }
}