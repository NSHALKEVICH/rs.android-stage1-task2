package subtask5

import java.lang.StringBuilder
import java.time.LocalDate
import kotlin.reflect.KClass
import java.time.format.DateTimeFormatter
import java.util.*

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {



        when (blockB) {
            Int::class->{
                var sm = 0
                for (item in blockA){
                    if (item is Int){
                        sm += item
                    }
                }
                return sm
            }

            String::class-> {
                val str_b = StringBuilder()
                for (item in blockA) {
                    if (item is String) {
                        str_b.append(item)
                    }
                }
                return str_b.toString()
            }

            else -> {
                var date = LocalDate.MIN
                var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")

                for (item in blockA) {
                    if (item is LocalDate && item > date) {
                        date = item
                    }
                };  return date.format(formatter)
            }

        }
    }
}
