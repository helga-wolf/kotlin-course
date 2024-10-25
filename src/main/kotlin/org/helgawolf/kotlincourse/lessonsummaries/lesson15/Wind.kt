package org.helgawolf.kotlincourse.lessonsummaries.lesson15

class Wind (val speed: Int) {

    fun convertSpeed(): Int {
        return speed * 100 / 3600
    }
}