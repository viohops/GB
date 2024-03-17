package Algorithms.Seminars.Seminar_3;

public class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Вершина стека

    // Добавление элемента на вершину стека
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Удаление и возврат верхнего элемента стека
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Просмотр верхнего элемента стека без его удаления
    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Проверка пустоты стека
    public boolean isEmpty() {
        return top == null;
    }
}
