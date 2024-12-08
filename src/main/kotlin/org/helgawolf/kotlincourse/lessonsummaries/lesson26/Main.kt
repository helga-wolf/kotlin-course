package org.helgawolf.kotlincourse.lessonsummaries.lesson26

// фии высш порядка м принимть ффии в кач аргта или возвр их как возвращаемый тип

fun processWebData(
    query: String,
    fetcher: (String) -> List<Map<String, Any>>,
    transformer: (List<Map<String, Any>>) -> List<User>,
    displayer: (List<User>) -> Unit
) {
    val rawData = fetcher(query)
    val transformedData = transformer(rawData)
    displayer(transformedData)
}

data class User(val name: String)

fun test () {

    val fetcher: (String) -> List<Map<String, Any>> = {
        //orm.select(it).map { listOf() }
        listOf(mapOf("andrey" to "5", ))
    }

//    val fetcher2: (String) -> List<Map<String, Any>> = {
//
//    }

    val transformer: (List<Map<String, Any>>) -> List<User> = {
        it.map { map -> User(map.keys.first()) }
    }

    val displayer: (List<User>) -> Unit = {
        println(it)
    }


    processWebData("sql guery", fetcher, transformer, displayer)
   // processWebData("another", fetcher2, transformer, displayer)
}