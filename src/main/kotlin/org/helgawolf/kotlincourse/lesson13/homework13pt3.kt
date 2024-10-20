package org.helgawolf.kotlincourse.lesson13

fun main(){

    //Задание 2. Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when

    val empty = listOf<Int>()
    println(adjectives(empty))
    val short = listOf<Int>(1, 2, 3)
    println(adjectives(short))
    val start = listOf<Int>(0, 1, 2, 3, 4, 5)
    println(adjectives(start))
    val massive = listOf<Int>(10, 100, 1000, 10000, 100000)
    println(adjectives(massive))
    val balanced = listOf<Int>(10, 10, 10, 10, 10, 10)
    println(adjectives(balanced))
    val sticky = List(20) { 1 }
    println(adjectives(sticky))
    val negative = listOf<Int>(-100, -99, -10, -50, -60)
    println(adjectives(negative))
    val positive = listOf<Int>(1001, 1002, 1003, 1024, 1016)
    println(adjectives(positive))
    val zbs = listOf<Int>(1, 2, 3, 10, 14)
    println(adjectives(zbs))
    val unique = listOf<Int>(1, 1, 1, 1, 1)
    println(adjectives(unique))

//    задание 3: Анализ Учебных Оценок
//    Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//    Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        grades.filter { it >= 60 }
            .sorted()
            .take(3)
    )

//    Задание 4: Создание каталога по первой букве.
//    Начальные значения: val list = listOf(
//        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
//        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
//        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
//        "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
//        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")

    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
        "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")

    println(list.map { it.lowercase() }
        .groupBy { it[0] }
    )

//    Задание 5: Подсчёт средней длины слов в списке.
//    Начальные значения из задачи 3.
//    Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.

    println("Средняя длина: %.2f".format((list.map { it.length }).average()))

//    Задание 6: Категоризация чисел.
//    Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//    Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(((numbers.distinct()).sortedDescending()).groupBy { if (it % 2 == 0) "четные" else "нечетные" })


//    Задание 7: Поиск первого подходящего элемента
//    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//    Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке,
//    или вернуть сообщение "Подходящий возраст не найден".

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(ages.filterNotNull().firstOrNull{ it > 18 }?.toString() ?: "Подходящий возраст не найден")


}

fun adjectives (numList: List<Int>): String {
    return when {
        numList.isEmpty() -> "Пусто"
        numList.size < 5 -> "Короткая"
        numList.getOrNull(0) == 0 -> "Стартовая"
        numList.sum() > 10000 -> "Массивная"
        numList.min() > 1000 -> "Положительная"
        numList.average() == 10.0 -> "Сбалансированная"
        numList.joinToString("").length == 20 -> "Клейкая"
        numList.max() <= -10 -> "Отрицательная"
        numList.contains(3) && numList.contains(14) -> "Пиздатая"
        else -> "Уникальная"
    }
}