package org.example

fun findAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { it.toCharArray().sorted().joinToString("") }
        .values
        .filter { it.size > 1 }
}

fun main() {
    val words = listOf("listen", "rat", "silent", "dog", "enlist",  "tar", "art", "god")
    val anagrams = findAnagrams(words)

    anagrams.forEach { println(it) }
}