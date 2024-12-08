package org.helgawolf.kotlincourse.lesson27.homework

//Создайте объект Employee и используйте apply для инициализации его полей email и department.

fun main() {

    //задание 2
    val employee = Employee("марфа васильевна", 40, "бухгалтер").apply {
        email = "martha@mail.com"
        department = "бухгалтерия"
    }


    //задание 3 - функция ниже
    val person = Person("настасья филипповна", 55).also { println(formattedOutput(it)) }

    //задание 4 Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.

    val personNotEmployee = Person("дуня", 60)

    val personToEmployee = with(personNotEmployee) {
        Employee("авдотья ильинична", 60, "главный бухгалтер")
    }

    // задание 5 Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и department с помощью apply, вернуть инициализированный объект.
val person5 = Person("евфросинья", 45).run {
    Employee("евфросинья", 45, "машинистка электропоезда").apply {
        email = "1111@666.com"
        department = "метро"
        return
    }


    ///задание 6 Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null

}





}


// задание 3 Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
//Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.

fun formattedOutput(obj: Person): String {
    return "name: ${obj.name}\nage: ${obj.age}" // с новой строки каждый параметр
}

// 6 - Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null

fun fun6 (obj: Person?): Employee? {
return obj?.let {
    Employee("имя", 35, "executive")
}
    obj ?: return null
}