package Seminar_4;

public class SimpleHashTable_2 {
    private int[] table; // массив для хранения значений
    private static final int SIZE = 16; // размер хэш-таблицы

    // Конструктор
public SimpleHashTable_2() {
table = new int[SIZE];
}

    // Добавить элемент в хэш-таблицу
    public void put(int key, int value) {
        int index = key % SIZE; // вычисляем индекс с помощью остатка от деления
        table[index] = value; // сохраняем значение в вычисленный индекс
    }

    // Получить элемент из хэш-таблицы
    public int get(int key) {
        int index = key % SIZE; // вычисляем индекс с помощью остатка от деления
        return table[index]; // возвращаем значение из вычисленного индекса
    }

    public static void main(String[] args) {
        SimpleHashTable_2 hashTable = new SimpleHashTable_2();
        hashTable.put(1, 100);
        hashTable.put(2, 200);

        System.out.println(hashTable.get(1)); // Выводит: 100
        System.out.println(hashTable.get(2)); // Выводит: 200
    }
}
