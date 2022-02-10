object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val one = charArrayOf('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't')
        val two = charArrayOf('d', 'g')
        val three = charArrayOf('b', 'c', 'm', 'p')
        val four = charArrayOf('f', 'h', 'v', 'w', 'y')
        val five = charArrayOf('k')
        val eight = charArrayOf('j', 'x')
        val ten = charArrayOf('q', 'z')

        return if (one.contains(c)) 1
        else if (two.contains(c)) 2
        else if (three.contains(c)) 3
        else if (four.contains(c)) 4
        else if (five.contains(c)) 5
        else if (eight.contains(c)) 8
        else if (ten.contains(c)) 10
        else 0
    }

    fun scoreWord(word: String): Int {
        var result = 0
        for (i in word.indices) {
            result += scoreLetter(word[i].toLowerCase())
        }
        return result
    }

}
