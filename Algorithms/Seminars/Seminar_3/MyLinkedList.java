package Algorithms.Seminars.Seminar_3;

public class MyLinkedList {

    // Определение класса для узла связного списка
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Ссылка на первый узел списка

    // Метод добавления нового элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Метод удаления первого элемента из списка
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(2);
        list.addFirst(1); // Добавляем 1 перед 2

        // Вывод значений узлов
        System.out.println(list.head.data); // Выведет 1
        System.out.println(list.head.next.data); // Выведет 2

        list.removeFirst(); // Удаляем первый узел (1)

        // Вывод значений узлов после удаления
        System.out.println(list.head.data); // Выведет 2
    }
}
