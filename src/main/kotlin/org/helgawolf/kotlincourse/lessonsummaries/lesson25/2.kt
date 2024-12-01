//package org.helgawolf.kotlincourse.lessonsummaries.lesson25
//
//fun main(){
//
//    val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
//        val deliveryTimeDays = when (productId) {
//            in 1..100 -> 3
//            else -> 5
//        }
//        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//    }
//
//    val calculateDeliveryTime: OrderProcessor.(Int) -> String = {
//        val deliveryTimeDays = when (it) {
//            in 1..100 -> 3
//            else -> 5
//        }
//        "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//    }
//
//
//fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
//    val deliveryTimeDays = when (productId) {
//        in 1..100 -> 3
//        else -> 5
//    }
//    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//
//
//
//class OrderProcessor(val deliveryAddress: String) {
//
//    fun calculateDeliveryTime(productId: Int): String {
//        val deliveryTimeDays = when (productId) {
//            in 1..100 -> 3
//            else -> 5
//        }
//        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//
