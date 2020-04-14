package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {

        val mh = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")

        val h = hour.toInt()
        if (h<0||h>24){
            return ""
        }

        return when (val m = minute.toInt()) {

            0 ->  "${mh[h]} o' clock"

            1 ->  "one minute past ${mh[h]}"

            15 ->  "quarter past ${mh[h]}"

            in 2..29 ->  "${mh[m]} minutes past ${mh[h]}"

            30 ->  "half past ${mh[h]}"

            45 ->  "quarter to ${mh[(h % 12) + 1]}"

            in 31..58 ->  "${mh[60 - m]} minutes to ${mh[(h % 12) + 1]}"

            59 ->  "one minute to ${mh[(h % 12) + 1]}"
            else -> ""


        }

    }
}

