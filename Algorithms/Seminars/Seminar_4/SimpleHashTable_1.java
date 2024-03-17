package Seminar_4;

import java.util.LinkedList;

public class SimpleHashTable_1 {
    // Инициализируем хэш-таблицу с 16 "бакетами"
    private LinkedList<KeyValuePair>[] table = new LinkedList[16];

    // Внутренний класс для хранения пар ключ-значение
    private class KeyValuePair {
        int key;
        int value;

        KeyValuePair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Метод для добавления элемента в хэш-таблицу
    public void put(int key, int value) {
        // Вычисляем индекс для хранения элемента в массиве
        int index = key % table.length;

        // Если в данной ячейке еще нет списка, создаем его
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Проверяем, нет ли уже такого ключа в списке (если есть, обновляем значение)
        for (KeyValuePair pair : table[index]) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }

        // Добавляем новую пару ключ-значение в список
        table[index].add(new KeyValuePair(key, value));
    }

    // Метод для поиска элемента по ключу
    public Integer get(int key) {
        int index = key % table.length;

        // Если в данной ячейке есть список
        if (table[index] != null) {
            // Перебираем все пары ключ-значение в этом списке
            for (KeyValuePair pair : table[index]) {
                // Если находим нужный ключ, возвращаем значение
                if (pair.key == key) {
                    return pair.value;
                }
            }
        }

        // Если элемент не найден, возвращаем null
        return null;
    }

    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(1, 100);
        hashTable.put(17, 1700); // Коллизия: 17 % 16 == 1 % 16

        System.out.println(hashTable.get(1)); // Вывод: 100
        System.out.println(hashTable.get(17)); // Вывод: 1700
    }
}
