package org.helgawolf.kotlincourse.lesson7

fun main(){

    //Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5){
        println(i)
    }

//Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10){
        if (i % 2 == 0)
        println(i)
    }

    //Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1){
        println(i)
    }

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1 step 2){
        println(i)
    }

//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2){
        println(i)
    }

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3){
        println(i)
    }

    //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
for (i in 1 until 9){
    println(i)
}

//Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    for (i in 3 until 15){
        println(i)
    }

Создайте цикл while, который выводит квадраты чисел от 1 до 5.

    var count = 0
    while (count < 5){
        println(++count * count)
    }
//блин помогите, не поняла почему так? почему мы каунт с нуля начинаем и с 5 у нас строгое неравеснство?

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль

    var count2 = 10
    while (count2 >= 5) {
            println(count2)
           count2--
    }

//Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    var variable = 5
    do{
        println(variable)
        variable--
    } while (variable >= 1)

//Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)

 //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10){
        if (i == 6) break
        println(i)
    }

//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var number = 1
    while (number <= 10){
        println(number)
        number++
    }

    //ЛИБО
    var number1 = 1
    while (true){
        println(number1)
        number1++
        if (number1 == 10) break
    }

    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for ( i in 1..10){
        if (i % 2 == 0) continue
        println(i)
    }

   //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
   var entity = 1
   while (entity <= 10){
       if (entity % 3 != 0)
       println(entity)
       entity++
   }

}