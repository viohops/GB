package HW_6;

import java.util.List;

public class ListComparator {

    // Метод для сравнения двух списков и вывода соответствующего сообщения
    public static String compareLists(List<Integer> list1, List<Integer> list2) {
        // Рассчитываем среднее значение каждого списка
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        // Сравниваем средние значения и возвращаем результат
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    // Метод для расчета среднего значения списка
    private static double calculateAverage(List<Integer> list) {
        // Если список пуст, возвращаем 0, чтобы избежать деления на ноль
        if (list.isEmpty()) {
            return 0;
        }
        
        // Вычисляем сумму элементов списка
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        // Возвращаем среднее значение
        return (double) sum / list.size();
    }
}