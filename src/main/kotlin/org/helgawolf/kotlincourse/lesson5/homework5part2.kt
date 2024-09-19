package org.helgawolf.kotlincourse.lesson5

fun main(){

    printSoundfading(45.0, null)
printFullCost(100500.0)
    printErrorPressure(null)

}

fun printSoundfading(beginVolume: Double, coefFading: Double?){
    var afterVolume = beginVolume * (coefFading ?:  0.5)
    println(afterVolume)

}

fun printFullCost(goodsPrice: Double){
    var goodsInsurance = (goodsPrice / 100 * 0.5)
        goodsPrice ?: 50
    var fullCost = goodsPrice + goodsInsurance
    println(fullCost)

}

fun printErrorPressure(atmPressure: Int?){
    atmPressure ?: throw Exception ("где показания давления????")
}