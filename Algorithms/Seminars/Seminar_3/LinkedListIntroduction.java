package Algorithms.Seminars.Seminar_3;

public class LinkedListIntroduction {
    public static void main(String[] args) {
        // Определение класса для узла связного списка
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        // Создание узлов и связывание их в список
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        firstNode.next = secondNode;

        // Вывод значений узлов
        System.out.println(firstNode.data); // Выведет 1
        System.out.println(firstNode.next.data); // Выведет 2
    }
}
