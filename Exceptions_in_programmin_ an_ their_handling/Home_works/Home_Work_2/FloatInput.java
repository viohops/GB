import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        float userFloat = getFloatInput();
        System.out.println("Вы ввели: " + userFloat);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float userFloat = Float.parseFloat(scanner.nextLine());
                return userFloat;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите корректное дробное число.");
            }
        }
    }
}