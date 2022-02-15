class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    init {
        val lengthA = a.toDouble()
        val lengthB = b.toDouble()
        val lengthC = c.toDouble()

        if (lengthA <= 0 || lengthB <= 0 || lengthC <= 0)
            throw IllegalArgumentException("The length of all sides must be greater than zero.")
        if ((lengthA + lengthB < lengthC) ||
            (lengthA + lengthC < lengthB) ||
            (lengthB + lengthC < lengthA)
        )
            throw IllegalArgumentException("The sum of the lengths of both sides must be greater than or equal to the length of the other side.")
    }

    val isEquilateral: Boolean = a == b && a == c
    val isIsosceles: Boolean = a == b || b == c || c == a
    val isScalene: Boolean = a != b && c != a && b != c
}
