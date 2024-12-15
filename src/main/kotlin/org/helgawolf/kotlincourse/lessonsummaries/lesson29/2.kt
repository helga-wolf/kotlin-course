package org.helgawolf.kotlincourse.lessonsummaries.lesson29

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime

fun main() {

    //текущая временная метка
    val currentTime = Instant.now()
    val myTime = Instant.ofEpochSecond(8787776768)
    println(myTime)

    val dayOne = LocalDate.of(2024, 9, 1)
    val dayTwo = LocalDate.of(2025, 5, 4)

    val differenceBetweenDays = Period.between(dayOne, dayTwo)
    println(differenceBetweenDays)

    val dayThree = Period.of(2, 4, 433)
    println(dayThree)

    println(dayTwo.plus(dayThree))

    val calendar = ZonedDateTime.of(2024, 12, 16, 10, 0, 0, 0, ZoneId.of("Europe/Moscow"))
println(calendar)

    println(dayThree.multipliedBy(2))

}