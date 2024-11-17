package org.helgawolf.kotlincourse.lessonsummaries.lesson21

class Container<T> (val item: T )
// класс контейнера ограниченный дженериком, хранит объект типа Т


// хранит 2 объекта разных типов:
class PairBox<A, B> (val first: A, val second: B)


//класс хранит nullable 1 объект числового типа:
class LimitedContainer<A: Number> (val item: A?)


//интерфес типизирован по дженерику и имеет 2 фии: первая принимает в аргумент объект этого типа
//а вторая возвращает обэект этого типа
interface Storage<T>{
    fun set (item: T)
    fun get(): T
}

//интерфейс траснформер работает с 2 дженериками
// ф-я в нем преобзразует объект типа а в тип б
interface Transformer<A, B>{
    fun transform(item: A): B
}

//ф-я принимает список указанного типа и 2 интовых индекса
//внутри списка поменять 2 позиции местами между собой по индексу
//fun<A> swap(list: List<A>, index1: Int, index2: Int): List<A>{}

//fun<B> second(list:List<B>, list2:List<B>):List<B>{}

//fun <K, V> toMap(keys:List<K>, values:List<V>): Map<K,V>{}