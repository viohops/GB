// Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, 
// является ли переданное число четным или нечетным: 
// public boolean evenOddNumber(int n) {            
//     if (n % 2 == 0) {                
//         return true;                  
//     } 
//     else {                
//         return false;                  
//     }            
// }


package HW_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberTest {
    @Test
    public void testEvenNumber() {
        Number numberChecker = new Number();
        boolean result = numberChecker.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        Number numberChecker = new Number();
        boolean result = numberChecker.evenOddNumber(7);
        assertFalse(result);
    }

    @Test
    public void testZero() {
        Number numberChecker = new Number();
        boolean result = numberChecker.evenOddNumber(0);
        assertTrue(result);
    }
}