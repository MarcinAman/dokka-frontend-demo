package components.footer

import kotlinx.css.*
import styled.StyleSheet

object FooterStyles : StyleSheet("FooterStyles", isStatic = true) {
    val goToTopIcon by css {

    }
    val footer by css {
        clear = Clear.both
        display = Display.flex
//        align-items: center;
//        position: relative;
//        height: var(--footer-height);
//        border-top: 1px solid #DADFE6;
//        font-size: 12px;
//        line-height: 16px;
//        letter-spacing: 0.2px;
//        color: var(--breadcrumb-font-color);
//        margin-top:auto;
    }
}