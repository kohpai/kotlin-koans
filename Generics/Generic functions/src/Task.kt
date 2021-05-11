import java.util.*

fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(
    a: C,
    b: C,
    p: (T) -> Boolean
): Pair<C, C> {
    val (fst, snd) = this.partition(p)
    a.addAll(fst)
    b.addAll(snd)
    return Pair(a, b)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(
            HashSet(),
            HashSet()
        ) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
