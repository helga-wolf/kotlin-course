package org.helgawolf.kotlincourse.lessonsummaries.lesson26

fun main() {

    val name:(Int) -> String = {
        it.toString() + "5"
    }
    smth28(name)

    val name2:(Int) -> String = {
        "${it + 5}"
    }

    smth28(name2)
}

fun smth26(
    arg1: () -> Unit
) {

}

fun smth27() {
    val smth = fun () {}
    val smth2: () -> Unit
}

fun smth28(arg2: (Int) -> String) {
    println(arg2(666))
}

fun<T> smth29(arg4: List<T>, arg3: (List<T>) -> T): T {
    return arg3(arg4)
}