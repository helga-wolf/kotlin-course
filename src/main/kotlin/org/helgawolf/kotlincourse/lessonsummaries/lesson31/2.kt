package org.helgawolf.kotlincourse.lessonsummaries.lesson31

import com.google.gson.Gson
import com.google.gson.GsonBuilder

data class University(
    val name: String,
    val foundationYear: Int,
    val isPublic: Boolean,
    val faculties: List<Faculty>
)

data class Faculty(
    val name: String,
    val dean: String,
    val establishedYear: Int,
    val students: List<Student>
)

data class Student(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val major: String?,
)

fun main() {

    val student1 = Student("John", "Doe", 20, "Computer Science")
    val student2 = Student("Jane", "Doe", 19, null)

    val faculty = Faculty("Engineering", "Dr. Smith", 1965, listOf(student1, student2))

    val university = University("Tech University", 1905, true, listOf(faculty))

//сериализация в джосн
    val gson = GsonBuilder().setPrettyPrinting().create()

    val json = gson.toJson(university)
    println(json)

    val revert = gson.fromJson(json, University::class.java)
    println(revert)

}