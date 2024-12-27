package org.helgawolf.kotlincourse.lesson32.homework

import java.lang.String.format

//Задание: Написание параметризованных юнит тестов для проверки преобразования номеров телефонов
//
//Описание задачи:
//
//Необходимо создать класс `PhoneNumberFormatter`, который будет иметь метод `formatPhoneNumber(input: String): String`.
// Этот метод должен преобразовывать входящие строки в стандартизированный формат номера телефона +7 (XXX) XXX-XX-XX. Алгоритм преобразования следующий:
//
//Очищаем строку от невалидных символов через замену всех нечисловых знаков на пустую строку. Делается это через replace который принимает regex выражение "\\D".toRegex() ( \\D - это выражение, которое находит все нечисловые значения)
//Если длина полученной числовой строки не равна 10 или 11 знакам - выкидываем исключение
//Если в строке 10 значений и она не начинается на 7 или 8, добавляем в начало 7 иначе выкидываем исключение
//Если строка начинается на `8` или `7`, символ заменяется на `+7`, иначе выкидываем исключение
//Создаём фрагменты номера с помощью substring и вставляем их в шаблон
//
//
//Требования к решению:
//
//- Создайте заготовку метода.
//- Напишите параметризованные юнит тесты, которые будут проверять различные варианты входных данных: валидные и невалидные номера телефонов.
//- В тестах используйте различные источники данных для параметров: валидные номера, невалидные номера, номера с лишними символами, короткие и длинные номера.
//
//Примеры для тестирования:
//
//- `8 (922) 941-11-11` -> `+7 (922) 941-11-11`
//- `79229411111` -> `+7 (922) 941-11-11`
//- `+7 922 941 11 11` -> `+7 (922) 941-11-11`
//- `9229411111` -> `+7 (922) 941-11-11`
//- `abc +7 922 941 11 11` -> `+7 (922) 941-11-11`
//- `12345` -> `Exception` (невалидный номер)
//- `+1 (922) 941-11-11` ->  `Exception` (невалидный номер)

class PhoneNumberFormatter () {
    fun formatPhoneNumber(input: String): String {

        //Очищаем строку от невалидных символов через замену всех нечисловых знаков на пустую строку.
        val replacement = input.replace("\\D".toRegex(), "")

        //Если длина полученной числовой строки не равна 10 или 11 знакам - выкидываем исключение
        if (replacement.length != 10 && input.length != 11) {
            throw Exception("Длина номера должна быть 10-11 символов")
        } else {
            return format("7$input")
        }


        //Если в строке 10 значений и она не начинается на 7 или 8, добавляем в начало 7 иначе выкидываем исключение
        if (replacement.length == 10 && (!replacement.startsWith("7") && !replacement.startsWith("8"))) {
            "7$replacement"
        } else {
            throw IllegalArgumentException("Номер должен начинаться на 7 или 8")
        }

        //Если строка начинается на `8` или `7`, символ заменяется на `+7`, иначе выкидываем исключение
        if (replacement.startsWith("7") || input.startsWith("8")) {
           "+7${input.drop(1)}" // дропаем первый символ
        } else {
            throw IllegalArgumentException("Номер должен начинаться на 7 или 8")
        }
        return ("+7 (" +
                "${replacement.substring(1, 4)}) " +
                "${replacement.substring(4, 7)}-" +
                "${replacement.substring(7, 9)}-" +
                "${replacement.substring(9)}")
    }


//    fun main() {
//        val input = "9998889080"
//        println( formatPhoneNumber(input))
//
//    }
}