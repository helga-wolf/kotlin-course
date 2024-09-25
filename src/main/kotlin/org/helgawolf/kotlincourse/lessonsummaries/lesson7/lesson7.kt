package org.helgawolf.kotlincourse.lessonsummaries.lesson7

import kotlin.system.exitProcess

fun main() {
    for (i in listOf(1,2,3)) {
        //внутри скобок тело фцикла. будет исполняться столько раз, сколько элтов в коллекции
    println(i)
    }

for (i in 1..10){
    println(i)
}

    val e = 4
    var t = ""
    for (i in listOf("iute", "wiwiiw")) {
    t = i
    println(i)
    }

    for (i in 10 downTo 1){
        println(1)
    }

for (i in 1..10 step 2){
    println(i)
}

    val range = 1..10
for (i in range){
    println(i)
}

    //тело while выполняется, пока выполняется условие
    while (false){
        println("+")
    }

    var counter = 10
    while (counter-- > 0){
        println(counter)
    }

    //do... while выполнится хотя бы один раз
    do {
        println("+")
    } while (false)

for (i in 1..10) {
    if (i == 2) continue
    if (i == 7) break
    println(i)
}

    for (i in 1..5){
        println(i*i)
    }

    //убывающая посл-ть четных чисел от 20 до 2
for (i in 20 downTo 2){
    if (i % 2 == 0)
        println(i)
}

  for (i in 1..30 step 3){
      println(i)
  }
    //суммирует числа от 1 до 10
    var count = 1
    var sum = 0
    while (count <= 10) {
        sum = sum + count++
    }
    println(sum)

    //колво цифр в числе начиная от ста и уменьшая на 1 в каждой итерации

    var counterr = 100
    while (counterr > 1){
       println(counterr--.toString().length)
    }

}
