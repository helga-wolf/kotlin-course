package org.helgawolf.kotlincourse.lessonsummaries.lesson10

fun main() {
    //массив - упорядоченная коллекция фиксированного размера, сод-я эл-ты одного типа
    // если тип явно не указан - оперделится автом-ки
    //из массива нельзя удалить или добавить значения - только заменить. как создался так и будет всегда одного размера
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" } //- лямбда-выражение
    val emptyArray666 = Array(5) { 1 } // массив из 5 элтов где каждый элт это единица
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)
    //создать массив без ничего можно только если элементы бцдцт наллабл

//массивы всегд изменяемы. списки - когда как

    val readOnlyList: List<String> = listOf("a", "b", "c")
    //listOf создает неизм список - ни довавить ни заменить ни удалить элт
    //но если там внутри модифицируемые обекты  - внутри них можно изменять

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    //а вот это уже изменяемый список - как содержимое чяекк так и их колво

    //множество - все элементы уникальны. если завести 2 одинак значения - второе будет проигнорировано
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1,2,3,4,5)//множество изменяемое

   //М Е Т О Д Ы

    mutableList.add("ui")// add добавляет в конец списка
    val set = setOf("k", "o", "t")// у множества НЕТ индексов. получить по индексу нельзя! можно только перебирать по очереди
    for(letter in set) {//перебор набора по очереди начиная с 1-го
        println("| $letter |")
    }
println(doubles[1])// получение элта по ииндексу - считаем начиная с 0

    val list = listOf(32, 53,1, -76)//работает тут не с самими элтами а с их индексами
    for (index in list.indices) {//создается диапазон индексов от 0 до 3 в данном примере
        if (index == list.lastIndex) {
            println(list[index] + list[0])
            println(list.last())//вернет последний индекс
        } else {
            println(list[index] + list[index + 1])
        }
    }

    //while только для списков и массивов тк там есть индекс
    //для сетов - for
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }// вывели все элты в обратном порядке в косых кавычках


    val array = Array (100) {0}
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val array1 = Array(10) { 0 }
    array1[0]=10
    for (i in array1.indices){
        array1[i]=(i+1)*10
    }
    println(array1.toList())

    val array2 = arrayOf("q", "we", "rty")
    for (i in array2.indices){
        array2[i]= " "
    }
    println(array2.toList())

    val array3 = arrayOf(2,3,4)
    val array4 = arrayOf(5,6,7)
    val emptyArray1 = Array(3) {0}
    for (i in emptyArray1.indices){
        emptyArray1[i] = array3[i] + array4[i]
    }

    val list1 = listOf<Int>()
    val list2 = listOf("lol", "kek", "dunno")
    for(i in list2) {
    println(i)
    }
    val mutableList1 = mutableListOf<Float> ()
    mutableList1.add(45F)
    mutableList1.add(38F)
    mutableList1.remove(45F)
    mutableList1.removeAt(0)
    println(mutableList1)


val emptySet = setOf<Int>()
    val setNum = setOf( 1, 2, 3, 4, 5)
    val setNum2 = mutableSetOf(1,2,3)
    setNum2.add(6)
    setNum2.remove(2)
    println(setNum2)

    for (elem in setNum2) {
        println(elem*elem)
    }

val set1 = setOf(1,2,3)
    val set2 = setOf(3,4,5,6,7)
    val emptySet1 = mutableSetOf<Int>()

    for (elem in set1) {
        emptySet1.add(elem)
    }
//    println(emptySet)
//    emptySet = mutableSetOf(1)
//    println(emptySet)
}

//fun findNumber (setNum: Set<Int>,num: Int): Boolean {
//    for (elem in setNum){
//        if (elem == num){
//            return true
//        }
//    }


