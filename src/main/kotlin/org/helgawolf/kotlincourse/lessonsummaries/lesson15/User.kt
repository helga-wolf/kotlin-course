package org.helgawolf.kotlincourse.lessonsummaries.lesson15

data class User(val id: Int, val name: String)

fun main() {
    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob")
println(user1)
    println(user2)
}
