package org.helgawolf.kotlincourse.lessonsummaries.lesson14

fun main() {

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

//деструктуризация, только со словарями:
    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }

    //получение данных из словаря:
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values

    //получение элтов
    fruitsPrices["pear"]!!
    val priceOfPearOrElse: Double = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() }
    val priceOfApple: Double = fruitsPrices.getValue("apple") // возвращает зн-е по данному ключу в виде нот наллабл
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)// вернет зн=е по ключу, если ключа нет то дефолтное зне

    //изменение состава
    val fruitsWithoutBanana = fruitsPrices - "banana" - "apple"// удалит банан и яблоко, создаст новый словарь
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5)// добавит новую пару значенийю создаст новый словарь
    val mutableFruits = fruitsPrices.toMutableMap() // создает новый изменяемый словарь из старого неизменяемого

// добавление элта
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear()// полное очищение словаря

    val containsAppleKey = fruitsPrices.containsKey("apple")// проверяет по ключу в явном виде, лучше его
    val containsApple = fruitsPrices.contains("apple")//для джавистов без ключа, не оч православно
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()

    //проверка элтов словаря на вып опр условия
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 } // ВСЕ соотв
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }// хоть кто-то

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

}

fun notMain(){

    val map = mapOf<String, Int>()
    for (entry in map.entries)
        println("${entry.key} = ${entry.value}")

    println(map.values)
    println(map.keys)

    val mapProductCount = mapOf<String, Int>()
    println(mapProductCount.getOrElse("apple"){throw Exception("not apple")})
    println(mapProductCount.containsKey("apple"))
    println(mapProductCount.containsValue(10))

    val listOfFruits = mapProductCount.map { "Продукт ${it.key} в количестве ${it.value}" }

    mapProductCount.isEmpty()
    mapProductCount.isNotEmpty()
    val allTens = mapProductCount.all { it.value > 10 }// передаем в ф-ю аргумент entry. all Это перебор всех элтов словаря как цикл for. каждый элт словаря это it
    val moreThanHundred = mapProductCount.any { it.value > 100}

    mapProductCount.filterValues { it > 100 } // фильтр на все где вэлью больше 100

    val mutableProducts = mapProductCount.toMutableMap()// конвертация в изменяемый словарь
    mutableProducts.remove("pineapple")// удаляем ананас
    mutableProducts.putAll(mapOf())// добавляем словарь в словарь
    mutableProducts.clear()//очищаем словарь
}