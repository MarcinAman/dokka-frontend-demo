package components.leftNavigation

import react.RProps
import react.dom.div
import react.functionalComponent
import styled.css
import styled.styledDiv
import styled.styledInput

val paneSearchComponent = functionalComponent<RProps> {
    styledDiv {
        css {
            +LeftNavigationStyles.paneSearch
        }
        attrs["id"] = "paneSearch"
        styledDiv {
            css {
                +LeftNavigationStyles.navigationPaneSearch
            }
            styledInput {
                css {
                    +LeftNavigationStyles.inputNavigationPane
                }
                attrs["id"] = "navigation-pane-search"
                attrs["placeholder"] = "Title search"
            }
        }
    }
}