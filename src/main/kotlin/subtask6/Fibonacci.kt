package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var count = 1
        var t1 = 0
        var t2 = 1

        while (t1*t2 <n) {
           // print("$t1 + ")
            val sm = t1 + t2
            t1 = t2
            t2 = sm
            count++

        }
        if (t1*t2 == n) {

         val result = intArrayOf(t1, t2, 1)

            return (result)

        }else {
            val result2 = intArrayOf(t1, t2, 0)
            return (result2)
        }



    }
}
