package org.helgawolf.kotlincourse.lesson30.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).

enum class TestStatuses() {
    PASS,
    BROKEN,
    FAILURE,
    ;
}

//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

enum class RealEstateTypes (val humanReadable: String) {
    ONE_ROOM_APT ("однушка"),
    TWO_ROOM_APT ("двушка"),
    THREE_ROOM_APT ("трешка"),
    SUPER_BIG_LUXURY_APT ("квартира с 4 и более комнатами"),
    DETACHED_HOUSE ("отдельный дом"),
    ROOM_IN_KOMMUNALKA ("комната в коммуналке"),
    VILLA ("вилла"),
    ;
}

//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class SolarSystemPlanets(val distanceToSunAU: Double, val massKg: Double) {
    MERCURY (0.387, 0.330e24),
    VENUS (0.723, 4.87e24),
    EARTH (1.0, 5.97e24),
    MARS (1.524, 0.642e24),
    JUPITER (5.203, 1898e24),
    SATURN (9.582, 568e24),
    URANUS (19.218, 86.8e24),
    NEPTUNE (30.070, 102e24),
    ;
}


//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины названия enum.

fun reaEstateAscending() {
    RealEstateTypes.entries
        .sortedBy { it.name.length }
        .forEach { println(it.humanReadable) }
}


//Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда. Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.

fun testResult(test: () -> Unit): TestStatuses {
    return try {
        test() // Выполняем переданную лямбду
        TestStatuses.PASS // Если выполнение прошло без исключений, возвращаем PASS
    } catch (e: AssertionError) {
        TestStatuses.FAILURE // Если возникло AssertionError, возвращаем FAILURE
    } catch (e: Exception) {
        TestStatuses.BROKEN // Для остальных исключений возвращаем BROKEN
    }
}

//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету и возвращать булево значение. Лямбда здесь выступает в качестве фильтра,
// который должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.


fun filterPlanets(planet: (SolarSystemPlanets) -> Boolean): SolarSystemPlanets {
   return SolarSystemPlanets.entries.firstOrNull(planet)
       ?: throw NoSuchElementException("Не нашлось нужноой планеты")
}


fun main() {
    //2
    reaEstateAscending()

    //3
    // Пример использования
    val status1 = testResult {
        // Здесь тест проходит успешно
        println("Test is running...")
    }
    println("Test status: $status1") // Ожидается PASS

    val status2 = testResult{
        // Здесь тест вызывает AssertionError
        assert(false) { "Test failed!" }
    }
    println("Test status: $status2") // Ожидается FAILURE

    val status3 = testResult {
        // Здесь тест вызывает другое исключение
        throw RuntimeException("An unexpected error occurred")
    }
    println("Test status: $status3") // Ожидается BROKEN


    //4

    val remotePlanet = filterPlanets { it.distanceToSunAU > 8 }
    println("Первая планета, которая находится дальше 8 а. е. от Солнца - $remotePlanet")

    val heavyPlanet = filterPlanets { it.massKg > 2e20}
    println("Первая планета, которая весит больше 2e20: $heavyPlanet")

    val exception = filterPlanets { it.massKg < 1e20 && it.distanceToSunAU > 15}


}