package org.helgawolf.kotlincourse.lesson21.homework

//Создайте интерфейс Mapper<T, R>, который будет определять метод для преобразования элементов типа T в элементы типа R.
interface Mapper<T, R> {
    fun map(input: T): R


    //Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список элементов типа T в список элементов типа R. Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.
    class PhrasesToListOfStrings : Mapper<String, List<String>> {
        override fun map(input: String): List<String> {
            return input.split(" ")
        }

        fun mapList(inputs: List<String>): List<List<String>> {
            return inputs.map { it.split(" ") }
        }
    }
}

