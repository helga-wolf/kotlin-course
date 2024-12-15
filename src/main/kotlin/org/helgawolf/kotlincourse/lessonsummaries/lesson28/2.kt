package org.helgawolf.kotlincourse.lessonsummaries.lesson28

import java.io.File

fun main() {
    val mapOne = mapOf("string" to 0.2, "yrytr" to 0.3, "rer" to 7.23)
    writeDataToFile(mapOne, "path/folder/lol/kek/kek.txt")

println(readFileToMap("path/folder/lol/kek/kek.txt"))

}

fun createFileOrDirectory (path: String) {
  File(path).apply {
      if (path.endsWith("/")) {
          File(path).mkdirs()
      } else {
          File(path).parentFile.mkdirs()
          File(path).createNewFile()
      }
  }
}

fun writeDataToFile(map: Map<String, Double>, path1: String) {
    val dataToString = map.map { "${it.key}=${it.value}" }.joinToString { "/n" }
    createFileOrDirectory(path1)
    File(path1).writeText(dataToString)
}

fun readFileToMap(path2: String) : Map<String, Double>{
    val file02 = File(path2).readLines()
    return file02.associate {
        val string1 = it.split("=")
        string1[0] to string1[1].toDouble()
    }
}