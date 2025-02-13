package org.helgawolf.kotlincourse.lessonsummaries.lesson29

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    val instant = Instant.now() //работа с таймстемпами в ютс формате = хранит время в виде разницы в секундах
   println(instant) //колво секунда от 1 янв 1970
    println(instant.toEpochMilli()) //миллисекунды

    val dateTimeNow = LocalDate.now() //хранит год день и месяц
    val birthday = LocalDate.of(1999, 10, 4)
    println(dateTimeNow)
    println(birthday)

    val localTimeNow = LocalTime.now()
    val endOfTheMyWorkingDay = LocalTime.of(18, 0, 0)

    val localDateTime = LocalDateTime.now()
    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)

    val vaticanCurrentTime = ZonedDateTime.now(ZoneId.of("Europe/Vatican"))
    val mobileWorldCongress = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))

 val vaticanCurrentTimeInstant = vaticanCurrentTime.toInstant()
 val birthdayInstant = birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))
 val instantToZonedDateTime = instant.atZone(ZoneId.systemDefault())
 val instantToOffsetDateTime = instant.atOffset(ZoneOffset.of("-02:00"))

 LocalDate.now().plusYears(1)
 LocalDateTime.now().plusSeconds(1)
 LocalDate.now().minusYears(1)

 Period.between(birthday, LocalDate.now()) //период от и до

 Duration.between(alarmClock, LocalDateTime.now())

 alarmClock.isAfter(localDateTime) //идет ли дата 1 после даты 2
 alarmClock.isBefore(localDateTime)
 alarmClock.isEqual(localDateTime)

 val nextAlarmClock = alarmClock.plus(5, ChronoUnit.MINUTES)
 val nextBirthday = birthday.plusYears(1)

 val nanoSeconds = Duration.ofNanos(200)
 println(nanoSeconds.dividedBy(4).toNanos())
 println(nanoSeconds.plus(Duration.ofSeconds(2)).toNanos())
 val seconds = Duration.ofSeconds(45)
 println(seconds.minusMinutes(1).seconds)
 val period = Period.of(2, 4, 10)
 println(period.minusMonths(13).toTotalMonths())
 val periodFromConferenceToBirthday = Period.between(mobileWorldCongress.toLocalDate(), birthday)
 println("${periodFromConferenceToBirthday.years} лет ${periodFromConferenceToBirthday.months} месяцев ${periodFromConferenceToBirthday.days} дней")


 val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")
 val formattedDate = vaticanCurrentTime.format(formatter)
 println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")
 val isoFormatter = DateTimeFormatter.ISO_DATE_TIME
 //val isoFormattedDate = birthdayInDubai.format(isoFormatter)
// println(isoFormattedDate)
 val prettyFormatter = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")
 val prettyFormattedDate = dateTimeNow.format(prettyFormatter)
 println(prettyFormattedDate)

 try {
  println("При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка ${localDateTime.format(formatter)}")
 } catch (e: Throwable) {
  e.printStackTrace()
 }

 try {
  println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format(formatter)}")
 } catch (e: Throwable) {
  e.printStackTrace()
 }

 val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)
 println(parsedDate)


}