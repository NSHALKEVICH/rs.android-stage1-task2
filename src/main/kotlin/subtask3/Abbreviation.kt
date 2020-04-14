package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        var i = 0
        var j = 0
        val aa = a.toUpperCase().toCharArray()
        val bb = b.toCharArray()
        while (j < bb.size && i < aa.size) {

           // println("a$j ")

            if (bb[j] == aa[i]) {
                i++
                j++

            } else {
                i++
            }
        }
        //println("$j ")

        if (j!= bb.size){

            val result:String = "NO"
            return (result)
        }else{

            val result2:String = "YES"
            return (result2)
        }

    }
}
