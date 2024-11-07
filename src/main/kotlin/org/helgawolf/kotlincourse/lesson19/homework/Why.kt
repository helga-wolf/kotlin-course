package org.helgawolf.kotlincourse.lesson19.homework


//ВАЖНАЯ ИНФА
// private - доступно ТОЛЬКО В ЭТОМ КЛАССЕ, НЕ В НАСЛЕДНИКАХ
// protected - доступно также в ПОДКЛАССАХ-НАСЛЕДНИКАХ

fun main(){
    val a = ChildrenClass("private", "protected", "public")
    a.printText()
    a.publicField = "Антонио Бандерас"
    println(a)//какая-то чушь
}

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // Ответ: эЭто аргумент, он в ChildrenClass кот наследуется от Base Class обозначен как просто val, то есть не приватная, таким образом мы обходим то, что здесь это привтаная переменная
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    // Ответ: это protected, значит доступно только в основном классе и в наследниках, нигде больше
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    // Ответ: тк здесь протектед класс (см. ниже), и если убрать протектед из функции, то идея ругается на exposure
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    // Ответ: PrivateClass у нас приватный (см ниже), это знач доступен только внутри класса. Все остальные уровни "защиенности" менее строгие, это нарушает
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //Ответ: я хз, помогите
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
//Ответ: Гет Олл есть в базовом классе, откуда мы здесь наследуемся, она там публичная

    // проверь, что выводится на печать при вызове функции printText()
    // Ответ: Выводится "Печать из BaseClass"
    // и объясни, почему не происходит переопределение метода privatePrint()
   // Ответ: потому что он private? не доступен ниоткуда кроме чилдрен класса
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}

