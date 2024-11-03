package org.helgawolf.kotlincourse.lesson17.homework

//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …

open class Furniture {
}

open class Sit : Furniture(){}
open class LayDown: Furniture(){}
open class Tables: Furniture(){}
open class Storage: Furniture(){}

open class Desk : Tables(){}
open class DinnerTable : Tables(){}
open class CoffeeTable: Tables(){}