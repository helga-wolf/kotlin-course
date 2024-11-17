package org.helgawolf.kotlincourse.lessonsummaries.lesson22.extensions

// в языках без расширения класса
fun String.removeSpaces(): String {
    return replace (" ", "")
}