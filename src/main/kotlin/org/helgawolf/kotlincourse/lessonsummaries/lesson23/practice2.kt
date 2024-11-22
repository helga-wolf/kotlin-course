package org.helgawolf.kotlincourse.lessonsummaries.lesson23

fun main(){

    val j: Any = listOf("Hello", "World", "Kotlin")
    println(j as List<String>)// приводим к строке
    println(j as List<Int>)// к списку интов. инт это дженерик. и  рантайме нет инфы какой именно тип дженерика исп-ся. поэтому тут нет ошибки. мы не обращается конкретно к элтам этоко сипска
   // println((j as List<Int>).get(0)).toString()// берем нулевой элт списка. тут ошибка тк обращается к конкр элту списка. а он не инт и поэтому ошибка


   // if (j is List<Int>){} - в рантайме не проверить тип дженерика, такая запись не имеет смысла

    //поэтому звездочка показывает что тип ЛЮБОЙ - wildcard
    if (j is List<*>){
        j.size

        //рпривели кусок списка к строке
        (j[1] as String).length
    }



    val i: String? = null
   // println(i as String)// привод к строке - ошибка нуль пойнтер экспешн. тк мы утверждает что это стринга не наллабл

    println(i as? Int) // БЕЗОПАСНО приводим кс троке

}