package org.helgawolf.kotlincourse.lessonsummaries.lesson15

//наслеедование, инкапсуляция, полиморфизм и абстракция
//классы и объекты

//класс - шаблон/чертеж, кот описывает, как ведет себя объект этого класса. сам по себе ничего не производит и не выполняет
//объект - экземпляр класса. создаются и уничтожаются динамически
fun main() {
    val person = Person("John", 30)
    val person1 = Person("John", 50)
    person.sayHello()
    println(person1)

    Logger.setdata(5)
    Logger.log("fgjh")

   val result = Calculator.add(1,4)
    Calculator.VERSION

    var lamp1 = Lamp(true)
    lamp1.switch()

    var wind = Wind (10)
    println(wind.convertSpeed())

    var car1 = Car(Car.brandList[1], "m5")
    car1.sayMyName()
}
