package Seminar_2;

public class SortingTest {
    public static void main(String[] args) {
        int[] array1 = new int[10000];
        int[] array2 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array1[i] = (int) (Math.random() * 10000);
            array2[i] = array1[i]; // Копирование элементов
        }

        long startTime = System.nanoTime();
        BubbleSort.sort(array1);
        long endTime = System.nanoTime();
        System.out.println("Время выполнения сортировки пузырьком: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        QuickSort.sort(array2, 0, array2.length - 1);
        endTime = System.nanoTime();
        System.out.println("Время выполнения быстрой сортировки: " + (endTime - startTime) + " наносекунд");
    }
}
