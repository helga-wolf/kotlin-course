package org.helgawolf.kotlincourse.lesson28.homework

import java.io.File

//1. Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

fun main() {
    println("задание 1")
    //путь до файла
    val filePath = "workspace/task1/example.txt"

    // cоздание объекта File
    val file = File(filePath)

    // Если директория не существует - создание
    if (!file.parentFile.exists()) {
        file.parentFile.mkdirs()
    }

    // пишем строку в файл
    file.writeText("Hello, Kotlin!")

    // проверка что файл сущ
    if (file.exists()) {
        println("файл $filePath успешно создан")
    } else {
        println("ошибка создания файла $filePath")
    }

    //Задача 2
    //Создайте директорию workspace/task2/testDir
    //проверьте, является ли она директорией, и выведите её абсолютный путь.
    println("задание 2")

    val dirPath = "workspace/task2/testDir"

    // объект файл создание
    val directory = File(dirPath)

    // созд дир-ю если не сущ
    if (!directory.exists()) {
        directory.mkdirs()
    }

    // явл ли объект директорией
    if (directory.isDirectory) {
        println("Абсол путь директории: ${directory.absolutePath}")
    } else {
        println("$dirPath не явл директорией")
    }

//3 Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и
// subDir2. Проверьте, что myDir действительно содержит эти поддиректории.

    println("задание 3")

    //папака myDir
    val basePath = "workspace/task3/structure/myDir"

    // делаем директории
    File(basePath).mkdirs()

    // вложенные поддир-ии
    val subDir1 = File("$basePath/subDir1")
    val subDir2 = File("$basePath/subDir2")

    //создаем
    subDir1.mkdir()
    subDir2.mkdir()

    // если май дир = налл, то
    val myDir = File(basePath)
    val contents = myDir.listFiles()?.toList()

    println("содержание директории $myDir:")
    if (contents != null) {
        for (file in contents) {
            println(file.name)
        }
    }
// Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий.
// Удалите директорию workspace/task4 со всем содержимым

    println("задание 4")

    //создаем директорию
    val tempDirectory = File("workspace/task4/temp")
    tempDirectory.mkdirs()

    // вложенную директорию dir1 в темп
    val dir1 = File(tempDirectory, "dir1")
    dir1.mkdir()

    // вложенный файл file1.txt в темп
    val file1 = File(tempDirectory, "file1.txt")
    file1.createNewFile()

    // вложенный файл file2.txt внутри dir1
    val file2 = File(dir1, "file2.txt")
    file2.createNewFile()

    // выводсодержимого temp
    println("содержимое директории temp:")
    tempDirectory.listFiles()?.forEach { file ->
        println(file.absolutePath)
    }

    // удаляем директорию workspace/task4  - см ф ю ниже
    deleteDirectory(File("workspace/task4"))


    //Задача 5
    //Создайте файл workspace/task5/config/config.txt
    //запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.
    println("задание 5")

    // Путь к файлу конфиг
    val filePath1 = "workspace/task5/config/config.txt"

    // созд дир-ю если она не сущ
    val parentDirectory = File("workspace/task5/config").apply {
        mkdirs()
    }

    // создаем файл конфиг тхт
    val configFile = File(parentDirectory, "config.txt")
    configFile.createNewFile()

    // запись в файл, ключ=значение
    val parameters = listOf(
        "key1=value1",
        "key2=value2",
        "key3=value3"
    )

    configFile.writeText(parameters.joinToString("\n"))

    // чтение данны, вывод значений
    val values = mutableListOf<String>()
    configFile.forEachLine {
        val parts = it.split('=')
        if (parts.size == 2) {
            values.add(parts[1])
        }
    }

    println("Значения из файла config.txt:")
    values.forEach(::println)

    //Задача 6
    //Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий,
    // а потом пути файлов

    println("задание 6")

    val rootDirectory = File("workspace")

    //список всех дир и файлов
    val directories = mutableListOf<File>()
    val files = mutableListOf<File>()

    rootDirectory.walk().forEach {
        if (it.isDirectory && it != rootDirectory) {
            directories.add(it)
        } else if (it.isFile) {
            files.add(it)
        }
    }

    //пути директорий распеч
    println("Директории:")
    directories.sortedBy { it.path }.forEach {
        println(it.path)
    }

    //пути файлов
    println("Файлы:")
    files.sortedBy { it.path }.forEach {
        println(it.path)
    }


    //Задача 7
    //Создайте директорию workspace/task9/docs.
    //Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст
    // "This is a README file."
    println("задание 7")

    // путь до дир докс
    val docsDirectory = File("workspace/task9/docs")

    // созадние если ее нет
    if (!docsDirectory.exists()) {
        docsDirectory.mkdirs()
    }

    // путь до ридми
    val readmeFile = File(docsDirectory, "readme.md")

    // наличие файла ридми
    if (!readmeFile.exists()) {
        // если нету - создаем и вписываем текст
        readmeFile.createNewFile()
        readmeFile.writeText("This is a README file.")

        println("Файл readme.md создан и заполнен текстом.")
    } else {
        println("Файл readme.md уже существует.") // если уже сть
    }
}


//8
//Создайте файлы
//workspace/task10/data/1/4/prod/data14.mysql
//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data сохраняя
// структуру директорий. Для копирования используй метод copyTo


// зад 4 функция для удаления директории
fun deleteDirectory(directory: File) {
    if (directory.isDirectory) {
        directory.listFiles()?.forEach { file ->
            if (file.isDirectory) {
                deleteDirectory(file)
            } else {
                file.delete()
            }
        }
    }
    directory.delete()
}
