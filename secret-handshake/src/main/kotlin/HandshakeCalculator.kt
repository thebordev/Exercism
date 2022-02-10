object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val binaryToSignal = Signal.values().asList()
        val binaryString = number.toString(2)
        val result = mutableListOf<Signal>()

        binaryString.reversed().forEachIndexed { index, item ->
            if (item == '1') {
                if (index < binaryToSignal.size) {
                    result.add(binaryToSignal[index])
                }
            }
        }
        return if (binaryString.reversed().getOrNull(4) == '1') result.reversed() else result
    }
}
