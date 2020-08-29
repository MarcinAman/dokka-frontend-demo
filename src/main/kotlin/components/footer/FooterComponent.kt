package components.footer

import kotlinx.html.unsafe
import react.RProps
import react.dom.a
import react.dom.div
import react.dom.span
import react.functionalComponent

val footerComponent = functionalComponent<RProps> {
    div("footer") {
        span("go-to-top-icon"){
            a(href = "#container") {
                attrs.unsafe { raw(goToTop)}
            }
        }
        span { +"© 2020 Copyright" }
        span("pull-right") {
            span { +"Sponsored and developed by dokka" }
            a(href = "https://github.com/Kotlin/dokka") {
                span(classes = "padded-icon") {
                    attrs.unsafe { raw(kotlinArrow)}
                }
            }
        }
    }
}