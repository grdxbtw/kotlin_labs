package org.example

fun String.countVowels(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().count { it in vowels }
}

fun main() {
    val text = "Test string with vowels"
    println("Number of vowels: ${text.countVowels()}")
    println(text)
}