package Algorithms.Seminars.Seminar_3;

public class Queue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Начало очереди
    private Node rear; // Конец очереди

    // Добавление элемента в конец очереди
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    // Удаление и возврат элемента из начала очереди
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Проверка пустоты очереди
    public boolean isEmpty() {
        return front == null;
    }
}
