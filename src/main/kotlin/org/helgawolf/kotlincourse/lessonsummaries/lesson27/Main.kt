package org.helgawolf.kotlincourse.lessonsummaries.lesson27

import java.io.File

fun main() {
    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    val l: MutableList<Int>.() -> Unit = {
        println(list.size)
        list.add(4)
        println(list.size)
    }

    // к объекту лист применят ф-ю Л
    with(list, l)

    // то же самое- идея предложить убрать из круглых скобок
    with(list) {
        println(list.size)
        list.add(4)
        println(list.size)
    }
    //приняли один объект, вернули другой


    list.add(5)
    val result = list.sum()

    val result2 = list.run {
        add(5)
        sum()
    }

    val s = File("example.txt").inputStream()
    val content = s.readBytes() //читает поток, записывает в переменную контент
    println(content)
    s.close()

    File("example.txt").inputStream().use {
        val content = it.readBytes()
        println(content.size)
    }

    val list4 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    list.also {
        println("adding 3 to list $it")
    }.add(3)


    val str: String? = null
    str?.let {
        println(it.length) //только если стр не налл
    } ?: println("is null")

}