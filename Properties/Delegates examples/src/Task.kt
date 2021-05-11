import kotlin.properties.Delegates

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy { initializer() }
}

