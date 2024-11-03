package org.helgawolf.kotlincourse.lesson17.homework

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class ExtractFirst(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()){
            return ""
        }
        if (extracted.size == 1){
            return extracted[0]
        }
        for (i in 1 until extracted.size){
            addMaterial(extracted[i])
        }
        return extractMaterial()[0]
    }
}

class ExtractLast(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()){
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 0 until extracted.size - 1){
            addMaterial(extracted[i])
        }
        return extracted.last()
    }
}

class ExtractMiddle(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        val middleIndex = extracted.size
        for (i in extracted.indices) {
            if (i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}

fun main(){
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    val m1 = ExtractMiddle()
    ordinalNumbers.forEach{ m1.addMaterial(it) }
    println(m1.extract())
    m1.printContainer()
}