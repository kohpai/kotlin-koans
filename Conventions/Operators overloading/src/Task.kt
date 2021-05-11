import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

data class TimeIntervals(val timeInterval: TimeInterval, val times: Int)

operator fun TimeInterval.times(times: Int) = TimeIntervals(this, times)

operator fun MyDate.plus(timeIntervals: TimeIntervals) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.times)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
