package Algorithms.Home_Works.HW_2;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Исходный массив:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Построение max-heap (пирамиды)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлечение элементов из max-heap и перестановка для сортировки
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int leftChild = 2 * i + 1; // Индекс левого потомка
        int rightChild = 2 * i + 2; // Индекс правого потомка

        // Если левый потомок больше корня
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Если правый потомок больше, чем самый большой элемент на данный момент
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно применяем heapify к поддереву
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

