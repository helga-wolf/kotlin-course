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

class MaterialsBottom(): Materials(){
    fun addToBottom(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        addMaterial(material)
        currentMaterials.forEach { addMaterial(it) }
    }
}

class ThroughTheLine : Materials() {
    fun alternation(newMaterials: List<String>) {
        val currentMaterials = extractMaterial()
        val maxSize = maxOf(newMaterials.size, currentMaterials.size)
        val result = mutableListOf<String>()

        for (k in 0 until maxSize) {
            if (k < newMaterials.size) result.add(newMaterials[k])
            if (k < currentMaterials.size) result.add(currentMaterials[k])
        }

        result.forEach { addMaterial(it) }
    }
}

class Alphabetical : Materials() {
    fun addAlphabetically(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        currentMaterials.add(material)
        currentMaterials.sort()
        currentMaterials.forEach { addMaterial(it) }
    }
}

class KeyValue : Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        val currentMaterials = extractMaterial().toMutableList()
        pairs.forEach{(key, value) ->
            currentMaterials.add(0, key)
            currentMaterials.add(value)
        }
        currentMaterials.forEach { addMaterial(it) }
    }
}

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
}

