package org.helgawolf.kotlincourse.lessonsummaries.lesson12

fun main(){
    //ф-я - это действие. она что-то делает, изменяет и тд
    //имя ф-ии должно отражать, что она делает
    // внутри функции нельзя переопределить аргументы

    val result = sum (1.1, 2.2, false)
println(result)
    val max = getMax(6, 3)


    val list = mutableListOf("ger", "ber")
    replaceString(list, "ger")
    println(list)

}

fun SayHello(){
    println("Hello world")
}

fun greetuser(name: String){
    println("Hello $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun  multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

fun doSomething() = Unit // не принимает аргументов, ничего не возвращает

fun getUsername(): String{ //не принимает аргументов, возвращает строку
    return ""
}

fun returnGreeting(grit:String){}

fun calcAres(area:Double, area1:Double): Double {
    return 9.0
}

fun findMax(ch1:Int, ch2:Int): Int{
    return 6
}

fun isNullOrEmpty(n:String?): Boolean {
    return false
}

fun calculateDiscount(disc:List<String>, arg:Int?): Double? {
    return null
}

fun sum(first:Double, second:Double, flag:Boolean): Double {
    if (flag) {
        val sum1 = first + second
        return sum1
    } else {
       val raz = first - second
        return raz
    }
}

fun getMax(f: Int, s: Int): Int {
    return if(f<s){
        s
    } else {
        f
    }
}
//то же самое:
fun getMax2(f: Int, s: Int) = if (f < s) s else f

fun printPositiveNumbers(a: List<Int>) {
    for(i in a){
        if (i > 0){
            println(i)
        } else return
    }
    println("that's all folks")
}

fun replaceString(strings: MutableList<String>, str: String){
    for(i in strings.indices){
        if(strings[i] == str){
            strings[i] = str.uppercase()
            return
        }
    }
    println("такого нет")
}


private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}


fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")
   // if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
   // if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
    val formatterSize = " $xSize".length
    val xRange = if (xSize > 0) {
        0..xSize
    } else {
        0 downTo xSize
    }
    val yRange = if (ySize > 0) {
        0..ySize
    } else {
        0 downTo ySize
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}