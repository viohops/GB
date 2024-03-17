/**Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
3) Найти максимальное значение
4) Найти среднее значение

То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу. 
*/

package JAVA.Home_Works.Home_work_3;

import java.util.ArrayList;

public class HomeWork03 {
    
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(5);
    numbers.add(7);
    numbers.add(12);
    numbers.add(3);
    numbers.add(9);

    removeEven(numbers);
    System.out.println(numbers); // [5, 7, 3, 9]

    Integer min = findMin(numbers);
    System.out.println(min); // 3

    Integer max = findMax(numbers);
    System.out.println(max); // 9

    double average = findAverage(numbers);
    System.out.println(average); // 6.0
}

/**
 * Удаляет чётные числа из списка.
 */
public static void removeEven(ArrayList<Integer> list) {
    int i = 0;
    while (i < list.size()) {
        if (list.get(i) % 2 == 0) {
            list.remove(i);
        } else {
            i++;
        }
    }
}

/**
 * Находит минимальное значение в списке.
 */
public static Integer findMin(ArrayList<Integer> list) {
    if (list.isEmpty()) {
        throw new IllegalArgumentException("List is empty");
    }
    Integer min = list.get(0);
    for (int i = 1; i < list.size(); i++) {
        Integer current = list.get(i);
        if (current < min) {
            min = current;
        }
    }
    return min;
}

/**
 * Находит максимальное значение в списке.
 */
public static Integer findMax(ArrayList<Integer> list) {
    if (list.isEmpty()) {
        throw new IllegalArgumentException("List is empty");
    }
    Integer max = list.get(0);
    for (int i = 1; i < list.size(); i++) {
        Integer current = list.get(i);
        if (current > max) {
            max = current;
        }
    }
    return max;
}

/**
 * Находит среднее значение списка.
 */
public static double findAverage(ArrayList<Integer> list) {
    if (list.isEmpty()) {
        throw new IllegalArgumentException("List is empty");
    }
    int sum = 0;
    for (Integer number : list) {
        sum += number;
    }
    return (double) sum / list.size();
}
    
}
