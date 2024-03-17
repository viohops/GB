public class Seminar_2{
    public static void main(String[] args) {System.out.println("Ytfvkjfb fjnvbf");    }

    // Метод для сортировки пузырьком
    /**
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов, если они стоят в неправильном порядке
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Если внутренний цикл не выполнил ни одной замены, то массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }
}
