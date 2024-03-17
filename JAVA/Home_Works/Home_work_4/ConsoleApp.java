package JAVA.Home_Works.Home_work_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    private static List<String> memory = new ArrayList<>();

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("print")) {
                printMemory();
            } else if (input.equals("revert")) {
                revertMemory();
            } else {
                addToMemory(input);
            }
        }
    }
}

private static void addToMemory(String input) {
    memory.add(input);
}

private static void printMemory() {
    for (int i = memory.size() - 1; i >= 0; i--) {
        System.out.println(memory.get(i));
    }
}

private static void revertMemory() {
    if (memory.isEmpty()) {
        System.out.println("Memory is already empty.");
    } else {
        memory.remove(memory.size() - 1);
    }
}


}
