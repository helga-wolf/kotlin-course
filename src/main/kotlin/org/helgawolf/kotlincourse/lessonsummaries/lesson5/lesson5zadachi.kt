package org.helgawolf.kotlincourse.lessonsummaries.lesson5

fun main1() {

    printVolume(userVolume = 100500)
    printVolume(userVolume = null)

    printPrice(200.0,null)
    printPrice(100.0, 20)

    printLang(lang = "Rus")
    printLang(lang = null)

    printBoxStuff(stuff = "666")
    printBoxStuff(null)

}

//вывести текущий уровень аудиосистемы. после перезагрузки уровень не назначен. дефолтный = 30 проц
fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}
//рассчитатть стоимость товара со скидкой, если стоимость известна, а скидка м б не устан
fun printPrice(price: Double, discount: Int?){
     val koef = (100 - (discount ?: 0))/100
        println(price * koef)
    }

//вернуть язык интерфейса, если не устан - то анг по дефолту
fun printLang(lang: String?) {
    val defaultLang: String = "EN"
    println(lang ?: defaultLang)
}

// проверить что в ящике есть товары, иначе завершить работу прилы
    fun printBoxStuff(stuff: String?){
        stuff ?: throw Exception ("box empty")

    }
