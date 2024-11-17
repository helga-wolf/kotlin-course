package org.helgawolf.kotlincourse.lesson21.homework

interface Validator<T> {
    fun validate(value: T): Boolean
}
class StringValidator : Validator<String?> {
    override fun validate(value: String?): Boolean {
        if (value == null || value.trim().isEmpty()) {
            return false
        }
        return true
    }
}
class OddValidator : Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 != 0
    }
}
