package org.helgawolf.kotlincourse.lesson15.homework

class Emotion (val type: String, val intensity: Int) {

    fun express(){
        println("Я испытваю $type с интенсивностью $intensity")
    }

}