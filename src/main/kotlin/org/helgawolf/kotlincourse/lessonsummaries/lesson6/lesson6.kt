package org.helgawolf.kotlincourse.lessonsummaries.lesson6

fun main() {
//    val number = 5
//
//    if (number > 5) {
//        println("число больше 5")
//    } else if (number == 0){
//        println("число меньше 5")
//    }

    getTimesOfDay(9)
    val intRange = 1..10
    val IntRangeUntil = 1 until 10
    val downTo = 10 downTo 1
    val charRange: CharRange = 'd'..'o'

    val inRange = 20 in intRange //входит ли в ранее заданный диапазон
    val notInRange = 20 !in intRange

    println(notInRange)
    println(inRange)

    val score = 66
    when (score) {
        in 90..100 -> println("zbs")
        in 80..89 -> println("ну сойдет")
        else -> println("ты лох")
    }

    //то же самое только с иф/элс, корректный по стилю пример записи:
    //исполняемый код закл в фигурные скобки, хотя язык этого не требует
    val points = 80
    if (points in 90..100){
        println("отлично")
    } else if (points in 80..89){
        println("хор")
    } else println("ужас")

    //если проверка одна, то иф-элс. если много, то when. НО, если в блоках кода много кода, лучше иф-элс

   //определение значения переменноц
    val a = 3
    val b = 4
    val max = if (a > b){
        a
    } else {
        b
    }
println(max)

    //нельзя много повторять принтлн
    //в таком случае его лучше запихнуть в переменную и ее уже println (переменная result)
    //переменную score см выше

    val result = when (score) {
        in 90..100 -> "отл"
        in 80..89 -> "норм"
        in 70..79 -> "ну тройбан"
        else -> "все оч плохо"
    }
    println(result)
    }




fun getTimesOfDay(hour: Int): String {
    if (hour >= 0 && hour < 5) return "night"
    if (hour >= 5 && hour < 12) return "morning"
    else return "night"
}