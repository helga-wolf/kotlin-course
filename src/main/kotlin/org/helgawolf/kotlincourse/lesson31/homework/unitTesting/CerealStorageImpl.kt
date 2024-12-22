package org.helgawolf.kotlincourse.lesson31.homework.unitTesting

import kotlin.math.min

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) { "Ёмкость контейнера не может быть отрицательной" }
        require(storageCapacity >= containerCapacity) { "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера" }
    }

    // Хранение количества крупы каждого типа
    private val storage = mutableMapOf<Cereal, Float>()


    //Метод добавляет крупу в соответствующий контейнер. Если контейнер для данной крупы отсутствует, то создается новый контейнер. В случае успешного добавления возвращает количество неиспользованной крупы, иначе выбрасывается исключение.
    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество добавляемой крупы не может быть отрицательным" }

        if (storage[cereal] == null) {
            // Если контейнера еще нет, проверяем, можем ли добавить новый контейнер
            if ((getTotalFilled() + containerCapacity) > storageCapacity) {
                throw IllegalStateException("Хранилище переполнено, нельзя добавить новый контейнер")
            }

            // Добавляем новый контейнер
            storage[cereal] = min(amount, containerCapacity)
            return maxOf(0f, amount - containerCapacity)
        } else {
            // Контейнер уже существует, пытаемся заполнить его до максимума
            val remainingSpace = containerCapacity - storage[cereal]!!
            val addedAmount = min(remainingSpace, amount)
            storage[cereal] = storage[cereal]!! + addedAmount
            return maxOf(0f, amount - addedAmount)
        }
    }

    //метод извлекает указанное количество крупы из соответствующего контейнера. Возвращает фактически полученное количество крупы.
    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество запрашиваемой крупы не может быть отрицательным" }

        if (storage[cereal] != null && storage[cereal]!! > 0) {
            val availableAmount = storage[cereal]!!
            val takenAmount = min(availableAmount, amount)
            storage[cereal] = maxOf(0f, availableAmount - takenAmount)
            return takenAmount
        }

        return 0f
    }

    //Удаляет контейнер, если он пуст. Возвращает true, если контейнер был удалён, и false, если контейнер не пуст.
    override fun removeContainer(cereal: Cereal): Boolean {
        if (storage.containsKey(cereal)) {
            if (storage[cereal]!! <= 0) {
                storage.remove(cereal)
                return true
            }
        }
        return false
    }

    //Возвращает текущее количество крупы в соответствующем контейнере.

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }


    //Возвращает свободное пространство в контейнере для указанной крупы.
    override fun getSpace(cereal: Cereal): Float {
        return if (storage.containsKey(cereal)) {
            containerCapacity - storage[cereal]!!
        } else {
            containerCapacity
        }
    }

    override fun toString(): String {
        return storage.entries.joinToString(", ") {
            "${it.key}: ${it.value} единиц"
        }.ifEmpty { "Хранилище пусто" }
    }

    // Вспомогательный метод для получения общего объема занятого пространства
    private fun getTotalFilled(): Float {
        return storage.values.sum()
    }


}
