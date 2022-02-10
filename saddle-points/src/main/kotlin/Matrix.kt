data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(

    private val matrix: List<List<Int>>

) {

    val saddlePoints: Set<MatrixCoordinate>
        get() = calcSaddlePoints()

    private fun calcSaddlePoints(): Set<MatrixCoordinate> {
        val set = mutableSetOf<MatrixCoordinate>()
        matrix.forEachIndexed loopY@ { y, row ->
            val maxInRows = row.max() ?: return@loopY
            row.forEachIndexed { x, value ->
                val minInCols = (0 until matrix.size).map { matrix[it][x] }.min() ?: return@loopY
                if (value in maxInRows..minInCols) {
                    set.add(MatrixCoordinate(y + 1, x + 1))
                }
            }
        }
        return set
    }
}