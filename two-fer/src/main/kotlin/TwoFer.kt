internal fun twofer(name: String = ""): String {
    return when (name) {
        "Alice" -> "One for Alice, one for me."
        "Bob" -> "One for Bob, one for me."
        "Zaphod" -> "One for Zaphod, one for me."
        else -> "One for you, one for me."
    }
}
