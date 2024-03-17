package Exceptions_in_programmin_an_their_handling.Home_works.Home_Work_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Запрос данных от пользователя
            System.out.print("Введите данные (Фамилия Имя Отчество ДатаРождения НомерТелефона Пол): ");
            String input = scanner.nextLine();

            // Разбиваем строку на части, разделенные пробелом
            String[] data = input.split(" ");

            // Проверяем количество введенных данных
            if (data.length != 6) {
                throw new IllegalArgumentException("Неверное количество данных");
            }

            // Извлекаем данные
            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String dateOfBirth = data[3];
            String phoneNumber = data[4];
            String gender = data[5];

            // Проверяем форматы данных
            if (!isValidDate(dateOfBirth)) {
                throw new IllegalArgumentException("Неверный формат даты рождения");
            }
            if (!isValidPhoneNumber(phoneNumber)) {
                throw new IllegalArgumentException("Неверный формат номера телефона");
            }
            if (!isValidGender(gender)) {
                throw new IllegalArgumentException("Неверный формат пола");
            }

            // Создаем или добавляем запись в файл
            FileWriter fileWriter = new FileWriter(surname + ".txt", true);
            fileWriter.write(surname + " " + name + " " + patronymic + " " + dateOfBirth + " " + phoneNumber + " " + gender + "\n");
            fileWriter.close();

            System.out.println("Данные успешно записаны в файл.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Проверка формата даты рождения
    private static boolean isValidDate(String date) {
        // Для упрощения, можно реализовать более строгую проверку
        return date.matches("\\d{2}\\.\\d{2}\\.\\d{4}");
    }

    // Проверка формата номера телефона
    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Для упрощения, можно реализовать более строгую проверку
        return phoneNumber.matches("\\d+");
    }

    // Проверка формата пола
    private static boolean isValidGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }
}
