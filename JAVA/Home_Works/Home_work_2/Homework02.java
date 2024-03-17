package JAVA.Home_Works.Home_work_2;

public class Homework02 {
    /**
 * 1. Реализовать метод isPalindrome
 * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
 */

/**
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */
static boolean isPalindrome(String source) {
    // Удаление всех пробелов из строки
    String trimmed = source.replaceAll(" ", "");
    // Преобразование строки в нижний регистр
    String lowerCase = trimmed.toLowerCase();
    // Проверка на палиндром
    int left = 0;
    int right = lowerCase.length() - 1;
    while (left < right) {
        if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

public static void main(String[] args) {
    System.out.println(isPalindrome("abcdedcba")); // true
    System.out.println(isPalindrome("a")); // true
    System.out.println(isPalindrome("abc")); // false
    System.out.println(isPalindrome("abcd")); // false
    System.out.println(isPalindrome("abba")); // true
}
}

