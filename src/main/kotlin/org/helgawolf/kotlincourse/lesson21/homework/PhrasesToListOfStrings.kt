package org.helgawolf.kotlincourse.lesson21.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(input: String): List<String> {
        return input.split(" ")
    }
}
fun main() {

val mapper = PhrasesToListOfStrings()
val phrases = listOf("Привет мир!", "Как дела?")
val wordsLists = mapper.mapList(phrases)
println(wordsLists) // Выведет: [[Привет, мир!], [Как, дела?]]
}

