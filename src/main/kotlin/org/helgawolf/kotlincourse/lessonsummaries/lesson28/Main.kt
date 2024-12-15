package org.helgawolf.kotlincourse.lessonsummaries.lesson28

import java.io.File

fun main() {
    val file = File("path/to/your/file.txt") // класс Файл нужно импортировать
    //без слэша в начале - от корня проекта, со слэшем - из корня файловой системы (проводник - диск ц/д)
    val directory = File("path/to/your/directory")

    file.parentFile.mkdirs()
    file.createNewFile()



//проверка сущ ли файл
    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")

    }
// созд нов файл - тут будет ошибка тк нет такой директории
    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }

    file.writeText("Hello, world!") //очищает и записывает файл заново

    val text = file.readText()
    println(text)


    (1..5).forEach {
        file.parentFile.resolve("$it").mkdirs()
    }


    val files = directory.listFiles()
    files?.forEach { file ->
        println(file.name)
    }


    if (file.delete()) { //если сущ и удален - будет тру, если не сущ или нет прав - фолс
        println("Файл удален")
    } else {
        println("Не удалось удалить файл")
    }

    if (file.deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }

// превратит все что внутри в поток - список без ограничения
    file.walk().filter { it.isFile }
        .associate { it.name to it.readLines() }
        .filterValues { data ->
            data.any {it.contains("text")}
        }

    //walk от исходной точки проходит по с=всему дереву каталогов и представит в виде списка
    // и с нем модно исп фильтры, преобразования типа filter, map
    //ассосиейт превр список в словарь
    //readLines рбота с данными в файлах - возвр список строк

    println(file.absoluteFile)
        //хранит абсол путь до файла
    val t: String = file.parent //возвр строку
    val k: File = file.parentFile // возвр файл

    println(file.parent)
    println(file.parentFile)

    val baseDir = File("path/to")
    val file1 = File("path/to/nested/file.txt")
    val relative = file1.toRelativeString(baseDir)
    println(file1.toRelativeString(baseDir))
    val baseDir2 = File("path2/to")
    val file3 = baseDir2.resolve(relative)
    file3.parentFile.mkdirs()
    file3.createNewFile()

    }