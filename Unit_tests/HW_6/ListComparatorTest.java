package HW_6;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListComparatorTest {

    // Тесты для метода compareLists из класса ListComparator

    @Test
    void testCompareLists() {
        // Проверяем, что программа правильно определяет, что первый список имеет большее среднее значение
        assertEquals("Первый список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(1, 2, 3), Arrays.asList(1, 2)));

        // Проверяем, что программа правильно определяет, что второй список имеет большее среднее значение
        assertEquals("Второй список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(1, 2), Arrays.asList(1, 2, 3)));

        // Проверяем, что программа правильно определяет, что средние значения равны
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));

        // Проверяем, что программа правильно определяет, что первый список имеет большее среднее значение (отрицательные числа)
        assertEquals("Первый список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(-1, -2, -3), Arrays.asList(-1, -2)));

        // Проверяем, что программа правильно определяет, что средние значения равны (пустые списки)
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Collections.emptyList(), Collections.emptyList()));
    }

    // Дополнительные тесты для метода compareLists

    @Test
    void testEmptyLists() {
        // Проверяем, что программа корректно обрабатывает случай, когда оба списка пусты
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Collections.emptyList(), Collections.emptyList()));
    }

    @Test
    void testDifferentLengths() {
        // Проверяем, что программа правильно работает, даже если списки имеют различные длины
        assertEquals("Первый список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        // Проверяем, что программа правильно обрабатывает разные списки с положительными и отрицательными числами
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Arrays.asList(-1, -2, 3), Arrays.asList(1, 2, -3)));
    }

    @Test
    void testEqualValues() {
        // Проверяем, что программа правильно обрабатывает случай, когда значения в списках одинаковы
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1)));
    }
}