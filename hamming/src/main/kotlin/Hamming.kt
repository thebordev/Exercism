object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var count = 0
        for (i in 0..leftStrand.length - 1) {
            if (leftStrand[i] != rightStrand[i])
                count++
        }
        return count
    }
}
