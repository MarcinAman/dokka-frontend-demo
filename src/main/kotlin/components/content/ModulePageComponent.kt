package components.content

import kotlinx.browser.window
import react.RProps
import react.dom.*
import react.functionalComponent
import react.useEffect
import react.useState
import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
internal data class ModulePagePackageElementView(
    val name: String,
    val location: String
)

@Serializable
internal data class ModulePageNodeView(
    val name: String,
    val description: String,
    val content: List<ModulePagePackageElementView>
)

internal sealed class ModulePageState {
    object Uninitialized : ModulePageState()
    data class Initialized(
        val content: ModulePageNodeView
    ) : ModulePageState()
}

val modulePageComponent = functionalComponent<RProps> {
    val (state, setState) = useState<ModulePageState>(ModulePageState.Uninitialized)

    useEffect {
        window.fetch(Constants.baseUrl + "/module-page.json")
            .then {
                it.text().then { json ->
                    val typed = Json.decodeFromString<ModulePageNodeView>(json)
                    setState(
                        ModulePageState.Initialized(
                            content = typed
                        )
                    )
                }
            }
    }

    when (state) {
        is ModulePageState.Uninitialized -> span { +"wait a second to fetch data" }
        is ModulePageState.Initialized ->
            div {
                div("cover") {
                    h1("cover") {
                        span {
                            +state.content.name
                        }
                    }
                }
                h2 {
                    +"Packages"
                }
                div("table") {
                    for (record in state.content.content) {
                        div("table-row") {
                            div("main-subrow") {
                                a(href = record.location) {
                                    +record.name
                                }
                            }
                        }
                    }
                }
            }
    }
}