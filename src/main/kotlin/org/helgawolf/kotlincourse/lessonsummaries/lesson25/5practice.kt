package org.helgawolf.kotlincourse.lessonsummaries.lesson25

fun main() {

    //анон ф я
    val fun4 = fun (list: List<Int>): Int {
        return list.filter { it > 0 }.sum()
    }

    //лямбда с указанием типа
    val fun2: (List<Int>) -> Int = { list ->
        list.filter { it > 0 }.sum()
    }

    //сокрашенная лямба
    val fun3 = { list: List<Int> ->
        list.filter { it > 0 }.sum()
    }


    val fun7 = fun Set<Int>.(): Set<Int> {
        return this.filter { it % 2 == 0 }.toSet()

    }

    val fun8: Set<Int>.() -> Set<Int> = {
        this.filter { it % 2 == 0 }.toSet()

    }

    val set = setOf(1,2,3)
    println(set.fun8())

//val fun70 = fun<T> (arg: T){} с дженериком нельзя


}



//сумма чисел в списке
fun fun4(list: List<Int>): Int {
    return list.filter { it > 0 }.sum()
}

//ф-я расширяет множество интов, возвращает отфильтрованное множество

fun Set<Int>.filterEven(): Set<Int> {
    return this.filter { it % 2 == 0 }.toSet()
}


fun<T> fun70(arg: T){

}