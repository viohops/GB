package Seminar_2;

public class BinarySearch {
    // Функция для поиска элемента в отсортированном массиве
    public static int search(int[] sortedArray, int target) {
        int left = 0; // Начало массива
        int right = sortedArray.length - 1; // Конец массива

        // Пока начало массива меньше или равно его концу
        while (left <= right) {
            int middle = (left + right) / 2; // Находим средний элемент

            // Если средний элемент равен искомому значению, возвращаем его индекс
            if (sortedArray[middle] == target) {
                return middle;
            }
            // Если средний элемент меньше искомого значения, ищем в правой половине массива
            if (sortedArray[middle] < target) {
                left = middle + 1;
            } else {
                // Иначе ищем в левой половине массива
                right = middle - 1;
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }
}
