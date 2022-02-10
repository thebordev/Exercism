import kotlin.math.pow

class Squares(

    private val a: Int

) {


    fun sumOfSquares(): Int {
        var result = 0
        for (i in 0..a) {
            result += i
        }
        return result.toDouble().pow(2.0).toInt()
    }

    fun squareOfSum(): Int {
        var result = 0
        for (i in 0..a) {
            result += i * i
        }
        return result
    }

    fun difference(): Int {
        return sumOfSquares() - squareOfSum()
    }
}
