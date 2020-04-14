package subtask1

import java.lang.Exception
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val dDay = day.toInt()
        val mMonth = month.toInt()
        val yYear = year.toInt()
        return try {
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru"))
            val date = LocalDate.of(yYear, mMonth, dDay)
            val dateEdited = date.format(formatter)
            return (dateEdited)

        }catch (ex: Exception) {
            "Такого дня не существует"
        }

    }

}




