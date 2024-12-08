package org.helgawolf.kotlincourse.lessonsummaries.lesson27

fun main() {

    val list = mutableListOf(1,2,3,4)

    list.add(6)
    println(list)

    val list1 = list.toList()


    //то же что выше
    val list2 = with (mutableListOf(1,2,3,4)) {
        add(6)
        println(this)
        toList()
    }.size // - применяет к последней строке внутри скобок. если убрать ту лист, то будет ощибка - принтлн возвращает юнит

    // with должна выполнять преобразование to что-то


    val sb = StringBuilder() //собирает в строку - не явл строкой
    sb.append("stroka1")
    sb.append("stroka2")
    sb.append("stroka3")
    val length = sb.length

    //то же что выше
    val sb1 = StringBuilder().run {
        append("stroka1")
        append("stroka2")
        append("stroka3")
        length
    }

    val list3 = arrayListOf<String>()
    list3.add("мама")
    list3.add("мыла")
    list3.add("раму")


    // то же что выше

    val list4: ArrayList<String> = arrayListOf<String>().apply {
        add("мама")
        add("мыла")
        add("раму")
    }

// this недсотупен в also
    val list5: ArrayList<String> = arrayListOf<String>().also {
        it.add("мама")
        it.add("мыла")
        it.add("раму")
    }

    val string: String? = "eueue"
    string?.length
    println(string?.isEmpty())
    println(string?.uppercase())

    //то дже что выше - проверяет на налл и выполняет блок кода если не налл

    string?.let {
        println(it.length)
        println(it.isEmpty())
        println(it.uppercase())
    }


}