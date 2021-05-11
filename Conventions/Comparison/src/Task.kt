data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) :
    Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val yearDiff = this.year - other.year
        return if (yearDiff == 0) {
            val monthDiff =
                this.month - other.month
            if (monthDiff == 0)
                this.dayOfMonth - other.dayOfMonth
            else
                monthDiff
        } else
            yearDiff
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
