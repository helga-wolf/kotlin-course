package org.helgawolf.kotlincourse.lesson31.homework.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

fun main() {

    val android1 = Employee(
        name = "Lena Petrova",
        isEmployed = true,
        birthDate = "11 sept 1985",
        position = CharacterTypes.ANDROID
    )

    val qa = Employee(
        name = "Olya Volkova",
        isEmployed = true,
        birthDate = "18 sept 1992",
        position = CharacterTypes.QA,
    )

    val teamLead = Employee (
        name = "Masha Ivanova",
        isEmployed = true,
        birthDate = "1 jan 1980",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(android1, qa)
    )

    val cto = Employee(
        name = "Katya Sidorova",
        isEmployed = true,
        birthDate = "75 march 1980",
        position = CharacterTypes.CTO,
        subordinates = listOf(android1, qa, teamLead)
    )

    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)
    val file = File("src/main/kotlin/org/helgawolf/kotlincourse/lesson31/homework/json/cto.json")
    file.parentFile.mkdirs()
    file.writeText(json)

    println(json)

    val readJson = file.readText()
    val readCto = gson.fromJson(readJson, Employee::class.java)

    println(readCto)

}