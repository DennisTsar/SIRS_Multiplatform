import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    console.log("Hello, ${greet()}")

    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-test")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count (Hello World)")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
            Button(attrs = {
                onClick { console.log("hi") }
            }
            ) {

                Text("Press Me!")
            }
        }
    }
}

fun greet() = "world"