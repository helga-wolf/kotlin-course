package org.helgawolf.kotlincourse.lesson29.homework

import java.sql.Date
import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

  // 1.  Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)

    println("-1-")
    val currentTime = Instant.now()
    val currentTime2 = System.currentTimeMillis() // Представляет время как целое число миллисекунд, прошедших с начала эпохи Unix.

    println(currentTime)
    println(currentTime2)

    // 2. Создай дату своего дня рождения.

    println("-2-")
    val myBirthday = LocalDate.of(1992, 9,18) // конкр дата
    println(myBirthday)

    // 3. Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.

    println("-3-")
    val todayDate = LocalDate.now() // текущая дата
    val howOldAmI = Period.between(myBirthday, todayDate).years // разница м/датами в годах
    println("мне $howOldAmI")


    //5 Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше. Не используй в них метод now()
    println("-4-")
    val localDate = LocalDate.of(1987, 9,30)
    val localTime = LocalTime.of(23, 34)
    val localDateTime = LocalDateTime.of(1666, 7, 4,13, 23)
    val offsetTime = OffsetTime.of(0, 10, 33, 89, ZoneOffset.of("-05:00"))
   val offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"))
    val zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"))
    val instant = Instant.ofEpochSecond(89797L)

   //4
    println("свой формат")
    println(ownFormatting(localDate))
    println(ownFormatting(localTime))
    println(ownFormatting(localDateTime))
    println(ownFormatting(offsetTime))
    println(ownFormatting(offsetDateTime))
    println(ownFormatting(zonedDateTime))
    println(ownFormatting(instant))
    println("ISO формат")
    println(formatISO(localDate))
    println(formatISO(localTime))
    println(formatISO(localDateTime))
    println(formatISO(offsetTime))
    println(formatISO(offsetDateTime))
    println(formatISO(zonedDateTime))
    println(formatISO(instant))

    //5
    println("-5-")
    val birthDate = LocalDate.of(1997, 1, 1)
    println(identifyGeneration(birthDate))

    //6
    val feb23 = LocalDate.of(2023, 2, 25)
    val feb24 = LocalDate.of(2024, 2, 25)

}




// 4. Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости
// от того, содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
// В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены
// в переданном объекте. Обработай в методе все типы дат, которые знаешь. Реализуй два варианта функции
// - с собственный форматированием и с форматами из ISO коллекции.

fun ownFormatting (temporal: Temporal): String {
return when (temporal) {
    is LocalDate -> temporal.toString()
    is LocalTime -> temporal.toString()
    is LocalDateTime -> temporal.toString()
    //относительно utc
    is OffsetTime -> temporal.toString()
    is OffsetDateTime -> temporal.toString()
    //дата время и врем зона
    is ZonedDateTime -> temporal.toString()
    is Instant -> temporal.toString()
    else -> "неизвестный формат: $temporal"
}
}

    fun formatISO (temporal: Temporal):String {
        return  when (temporal) {
            is LocalDate -> DateTimeFormatter.ISO_LOCAL_DATE.format(temporal)
            is LocalTime -> DateTimeFormatter.ISO_LOCAL_TIME.format(temporal)
            is LocalDateTime -> DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(temporal)
            //относительно utc
            is OffsetTime -> DateTimeFormatter.ISO_OFFSET_TIME.format(temporal)
            is OffsetDateTime -> DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(temporal)
            //дата время и врем зона
            is ZonedDateTime -> DateTimeFormatter.ISO_ZONED_DATE_TIME.format(temporal)
            is Instant -> DateTimeFormatter.ISO_INSTANT.format(temporal)
            else -> "неизвестный формат: $temporal"
        }
    }


// 6. Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
// определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из
// этих диапазонов, функция должна возвращать "Не определено". Для сравнения дат используй методы isAfter(otherDate)
// и isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

private val boomerStart = LocalDate.of(1945, 12, 31)
private val boomerEnd = LocalDate.of(1965, 1, 1)
private val zoomerStart = LocalDate.of(1996, 12, 31)
private val zoomerEnd = LocalDate.of(2013, 1, 1)
fun identifyGeneration(birthDate: LocalDate): String {
    return when {
         birthDate.isBefore(boomerEnd) && birthDate.isAfter(boomerStart) -> "Бумер"
        birthDate.isBefore(zoomerEnd) && birthDate.isAfter(zoomerStart) -> "Зумер"
        else -> "Не определено"
    }

}

//7. Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))

fun formatter(dateToFormat: LocalDate) {

}