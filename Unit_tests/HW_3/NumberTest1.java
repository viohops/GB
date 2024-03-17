// Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли 
// переданное число в интервал (25;100) public boolean numberInInterval(int n) { … }

package HW_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberTest1 {
    @Test
    public void testNumberInInterval() {
        Number numberChecker = new Number();

        // Проверяем числа внутри интервала (25;100)
        assertTrue(numberChecker.numberInInterval(26));
        assertTrue(numberChecker.numberInInterval(50));
        assertTrue(numberChecker.numberInInterval(99));

        // Проверяем числа за пределами интервала
        assertFalse(numberChecker.numberInInterval(24)); // Ниже интервала
        assertFalse(numberChecker.numberInInterval(100)); // Выше интервала
        assertFalse(numberChecker.numberInInterval(0));  // Гораздо ниже интервала
    }
}
