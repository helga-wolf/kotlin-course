package org.helgawolf.kotlincourse.lesson21.homework


fun main(){
    //1
    val keys = listOf("key1", "key2", "key3")
    val values = listOf(10, 20, 30, 40)

    val result = toMap(keys, values)
    println(result) // {key1=10, key2=20, key3=30}

//2
    val list1 = listOf(1, 2, 3, 4, 5)
    val middle1 = getMiddleElement(list1) // рез-т 3

    val list2 = listOf('a', 'b')
    val middle2 = getMiddleElement(list2) //'a'

    val emptyList = emptyList<Int>()
    val middle3 = getMiddleElement(emptyList) //null

//5
    val mapper = PhrasesToListOfStrings()
    val phrase = "Привет мир!"
    val words = mapper.map(phrase)
    println(words) //[Привет, мир!]

}



fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val size = minOf(keys.size, values.size)
    return keys.take(size).zip(values.take(size)).toMap()
}

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isEmpty()) return null

    val middleIndex = list.size / 2
    return list[middleIndex]
}

