package components.leftNavigation

import kotlinx.css.*
import styled.StyleSheet

object LeftNavigationStyles: StyleSheet("LeftNavigationStyles", isStatic = true) {
    val paneSearch by css {
        width = 240.px
        margin = "0 auto"
    }

    val inputNavigationPane by css {
        background = "white"
        border = "1px solid #A6AFBA"
        boxSizing = BoxSizing.borderBox
        borderRadius = 4.px
        padding = "8px"
        height = 40.px
        width = 100.pct
    }

    val navigationPaneSearch by css {
        paddingTop = 16.px
        width = 100.pct
    }
}