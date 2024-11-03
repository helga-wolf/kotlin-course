package org.helgawolf.kotlincourse.lesson17.homework

//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …

// базовый класс учебное заведение
open class StudyInstitution {

}

//школа наследуется от уч заведения
open class School : StudyInstitution() {

}
//лицей насл-ся от школы
class Lyceum : School(){

}
//гимназия - от школы
class Gymnasium : School() {

}

//колледж насл-ся от уч заведения
open class College: StudyInstitution(){

}
