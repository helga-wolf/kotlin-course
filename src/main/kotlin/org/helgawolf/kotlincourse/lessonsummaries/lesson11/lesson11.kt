package org.helgawolf.kotlincourse.lessonsummaries.lesson11

fun main(){

    val pair: Pair<Int, String> = 1 to "a"
    // объект кот хранит сразу 2 любых типа
    //вспомогательный для map

    val pair2 = Pair(2, "a")// то же что выше

println(pair.first)
    println(pair.second)

val emptyMap: Map<String, String> = mapOf<String, String>()
//словарь - простые(инт, стринг) и сложные типы

    val a1 = "Russia" to "Moscow"
    val a2 = "France" to "Paris"
val capitals = mapOf(a1, a2)

   val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf("Russia" to "Moscow", "France" to "Paris")

    val capotalOfRussia = capitals["Russia"]
    println(capotalOfRussia)

    mutableCapitals["Germany"] = "Berlin"
    mutableCapitals.remove("France")

for (entries in mutableCapitals){
    println("${entries.key} : ${entries.value}")
}

  for ((country, capital) in capitals) {
      println("$country: $capital")
  }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)


    val myMap: Map<String, Int> = mapOf()
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    val myFavMap = mutableMapOf(1 to "a")

    myFavMap[34] = "asf"//добавляем

    println(myFavMap[1])
    println(myFavMap[666])//будет налл
    myFavMap.remove(34)// удаляем

    for (entries in myLovingMap){
        println("${entries.key}: ${entries.value}")
    }
for ((key, value)in myLovingMap){
    println("$key : $value")
}

    val myOneMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 3, 4))

    val timetableMap = mapOf<String, List<String>>()
    val coursesMap = mapOf<String,MutableMap<String, String>>()
    val gameMap = mapOf<String, MutableSet<String>>()

}

fun searchKey (myMap: Map<String, String>, word: String): String{
    for ((key, value) in myMap){
        if (value==word) return key
    }
    return "lol"
}


//fun getD(): Pair