package components

import components.content.modulePageComponent
import components.footer.footerComponent
import components.leftNavigation.logoComponent
import components.leftNavigation.paneSearchComponent
import components.leftNavigation.sideMenuComponent
import react.*
import react.dom.*

val rootComponent = functionalComponent<RProps> {
    div {
        attrs["id"] = "container"
        div {
            attrs["id"] = "leftColumn"
            child(logoComponent)
            child(paneSearchComponent)
            child(sideMenuComponent)
        }
        div {
            attrs["id"] = "main"
            div {
                attrs["id"] = "searchBar"
            }
            div {
                attrs["id"] = "content"
                child(modulePageComponent)
            }
            child(footerComponent)
        }
    }
}