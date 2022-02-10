class Matrix(private val matrixAsString: String) {

    private val data: List<List<Int>> = matrixAsString.split("\n").map {
        it.trim().split("[ ]+".toRegex()).map {it.toInt()}
    }

    fun column(colNr: Int): List<Int> {
        return data.map {it[colNr-1]}.toList()
    }

    fun row(rowNr: Int): List<Int> {
        val text = arrayListOf<String>()
        val numbers = arrayListOf<Int>()
        for (name in matrixAsString.split("\n")) {
            text.add(name)
        }
        text[rowNr - 1].split(" ").forEach { numbers.add(it.toInt()) }
        return numbers
    }
}



fun main() {
    val matrixAsString = """
            1 2 3
            4 5 6
            7 8 9
            """.trimIndent()
    val columnIndex = 3
    println(Matrix(matrixAsString).column(columnIndex))

    //println(matrixAsString.split(","))
}