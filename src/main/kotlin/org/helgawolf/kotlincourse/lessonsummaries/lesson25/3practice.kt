package org.helgawolf.kotlincourse.lessonsummaries.lesson25

fun main(){

    //анонимная функиця
    val fun1 = fun (){
        println("hello world")
    }

    //это же - лямбда. вместо двоетояия для обозначаения что возвращает исп-ся стредочка
    val fun2: () -> Unit = {
        println("hello world")
    }
// здесь мы объявили перменную, дали название, указали тип (лямбда пустые скобки) и присваиваем блок кода в фиг скобгах

//избавляемся от типа
    val fun3 = {
        println("hello world")
    }

    //работа с 2 ф-ей

    //все как внизу - кроме названия! АНОНИМНАЯ
    val function = fun (arg: String): Int {
        return arg.length
    }

//лямбда без названия аргумента - вместо него ИТ (когда один аргумент)
    val function1:(String) -> Int = {
        it.length
    }

    //упрощенная лямбда без типа пеерменной
    val function2 = { arg: String ->
        arg.length
    }

}


//Unit - ф-я ничего не возвращает
fun fun1 (): Unit{
    println("hello world")
}

//ф-я принимает строку, возвращает число
fun function1(arg: String): Int {
    return arg.length
}