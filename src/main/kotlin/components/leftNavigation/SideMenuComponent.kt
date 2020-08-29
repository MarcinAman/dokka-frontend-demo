package components.leftNavigation

import react.RProps
import react.dom.a
import react.dom.div
import react.functionalComponent

val sideMenuComponent = functionalComponent<RProps> {
    div {
        attrs["id"] = "sideMenu"
        div("sideMenuPart"){
            div("overview") {
                a(){
                    +"example"
                }
            }
        }
    }
}