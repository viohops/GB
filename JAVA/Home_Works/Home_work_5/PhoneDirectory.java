package JAVA.Home_Works.Home_work_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    private static Map<String, List<String>> phoneBook = new HashMap<>();

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        String command;

        while (true) {
            command = scanner.nextLine();

            if (command.startsWith("ADD")) {
                addContact(command);
            } else if (command.startsWith("GET")) {
                getContacts(command);
            } else if (command.startsWith("REMOVE")) {
                removeContacts(command);
            } else if (command.equals("LIST")) {
                listContacts();
            } else if (command.equals("EXIT")) {
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}

private static void addContact(String command) {
    String[] tokens = command.split(" ");
    if (tokens.length != 3) {
        System.out.println("Invalid command format. Please use: ADD <LastName> <PhoneNumber>");
        return;
    }

    String lastName = tokens[1];
    String phoneNumber = tokens[2];

    List<String> contacts = phoneBook.getOrDefault(lastName, new ArrayList<>());
    contacts.add(phoneNumber);
    phoneBook.put(lastName, contacts);
}

private static void getContacts(String command) {
    String[] tokens = command.split(" ");
    if (tokens.length != 2) {
        System.out.println("Invalid command format. Please use: GET <LastName>");
        return;
    }

    String lastName = tokens[1];
    List<String> contacts = phoneBook.get(lastName);
    if (contacts == null) {
        System.out.println("No contacts found for last name: " + lastName);
    } else {
        System.out.println(contacts);
    }
}

private static void removeContacts(String command) {
    String[] tokens = command.split(" ");
    if (tokens.length != 2) {
        System.out.println("Invalid command format. Please use: REMOVE <LastName>");
        return;
    }

    String lastName = tokens[1];
    List<String> removedContacts = phoneBook.remove(lastName);
    if (removedContacts == null) {
        System.out.println("No contacts found for last name: " + lastName);
    }
}

private static void listContacts() {
    for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
        String lastName = entry.getKey();
        List<String> contacts = entry.getValue();
        System.out.println(lastName + " = " + contacts);
    }
}

}
