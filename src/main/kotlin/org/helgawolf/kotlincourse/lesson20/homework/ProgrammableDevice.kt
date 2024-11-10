package org.helgawolf.kotlincourse.lesson20.homework

open class ProgrammableDevice : PowerableDevice() {

    private val programmedActions = mutableListOf<String>()

    open fun programAction(action: String) {
        programmedActions.add(action)
    }

    fun execute() {
        if (programmedActions.isNotEmpty()) {
            println("Выполняется программа: ${programmedActions.joinToString(", ")}")
            programmedActions.clear()
        } else {
            println("Ничего не запрограммировано")
        }
    }
}