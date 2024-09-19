package org.helgawolf.kotlincourse.lesson5

fun main(){

    printSoundfading(45.0, null)
printFullCost(666.0)
    printErrorPressure(null)

}

fun printSoundfading(beginVolume: Double, coefFading: Double?){
    var afterVolume = beginVolume * (coefFading ?:  0.5)
    println(afterVolume)

}

fun printFullCost(goodsPrice: Double?, insuranceCoef: Double = 0.005){
    val defaultGoodsPrice = 50.0
    val goodsInsurance = ((goodsPrice ?: defaultGoodsPrice) * insuranceCoef)
    println((goodsPrice ?: defaultGoodsPrice) + goodsInsurance)

}

fun printErrorPressure(atmPressure: Int?){
    atmPressure ?: throw Exception ("где показания давления????")
}