class DateRange(private val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    var current = start

    override fun iterator() = object : Iterator<MyDate> {
        override fun hasNext(): Boolean = current <= end

        override fun next(): MyDate {
            val tmp = current
            current = current.followingDate()
            return tmp
        }
    }
}

fun iterateOverDateRange(
    firstDate: MyDate,
    secondDate: MyDate,
    handler: (MyDate) -> Unit
) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}