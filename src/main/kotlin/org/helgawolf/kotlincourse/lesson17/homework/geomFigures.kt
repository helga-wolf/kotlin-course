package org.helgawolf.kotlincourse.lesson17.homework


//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник


// базовый класс геом фигуры
open class GeometricFigure {
}

// Производный класс от GeometricFigure - многуголтник, делаем опен чтобы от него можно было делать наследование
open class Polygon : GeometricFigure() {
}

// треугольник наследуется от многоугольника
class Triangle : Polygon() {
}

// 4-уголньик наследуется от многоугольника
class Quadrilateral : Polygon() {
}

// круг наследуется от геометрик фигуры
class Circle : GeometricFigure() {
}
