
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class Gigasecond {

    private val gigaSeconds = 1_000_000_000L

    val date: LocalDateTime

    constructor(localDate: LocalDate){
        date = LocalDateTime.of(localDate, LocalTime.MIN)
            .plus(gigaSeconds, ChronoUnit.SECONDS)
    }

    constructor(localDateTime:LocalDateTime){
        date = localDateTime.plus(gigaSeconds, ChronoUnit.SECONDS)
    }
}