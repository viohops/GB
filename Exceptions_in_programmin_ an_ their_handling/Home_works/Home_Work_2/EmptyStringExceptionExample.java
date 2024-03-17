

import java.util.Scanner;

public class EmptyStringExceptionExample {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (userInput.isEmpty()) {
                throw new IllegalArgumentException("Пустые строки вводить нельзя.");
            } else {
                System.out.println("Вы ввели: " + userInput);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        return scanner.nextLine();
    }
}
