// Получение элемента из массива по индексу

public class ConstantTimeExample {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Получаем 5-й элемент массива. Это действие выполняется за постоянное время
        // O(1),
        // так как для доступа к элементу массива по индексу не требуется просматривать
        // другие элементы.
        int fifthElement = getArrayElement(array, 4);
        System.out.println(fifthElement);
    }

    public static int getArrayElement(int[] array, int index) {
        return array[index];
    }
}
// Проверка четности числа

public class ConstantTimeExample {

    public static void main(String[] args) {
        int number = 42;

        // Проверяем, является ли число четным. Это действие также выполняется за
        // постоянное время O(1),
        // так как нам просто нужно взять остаток от деления числа на 2, без учета его
        // размера.
        boolean isEven = isEvenNumber(number);
        System.out.println(isEven);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}