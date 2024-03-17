package Algorithms.Seminars.Seminar_3;

import java.util.LinkedList;
import java.util.Queue;

public class DynamicTaskQueue {

    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();

        // Добавляем задания в очередь
        taskQueue.add("Задание 1");
        taskQueue.add("Задание 2");
        taskQueue.add("Задание 3");

        System.out.println("Текущие задания в очереди: " + taskQueue);

        // Удаляем задание из очереди
        String removedTask = taskQueue.poll();
        System.out.println("Удалено задание: " + removedTask);

        System.out.println("Текущие задания в очереди после удаления: " + taskQueue);

        // Добавляем новое задание
        taskQueue.add("Задание 4");
        System.out.println("Текущие задания в очереди после добавления: " + taskQueue);

        // Пока очередь не пуста, обрабатываем задания
        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println("Обрабатывается " + task);
            System.out.println(task + " обработано!");
        }
    }
}