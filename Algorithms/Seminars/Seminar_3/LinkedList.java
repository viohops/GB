package Algorithms.Seminars.Seminar_3;

public class LinkedList {

    // Определение класса для узла связного списка
    class Node {
        int data; // Данные, хранимые в узле
        Node next; // Ссылка на следующий узел

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Ссылка на первый узел списка

    // Метод добавления нового элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        newNode.next = head; // Новый узел теперь ссылается на текущий первый узел
        head = newNode; // Новый узел становится первым узлом в списке
    }

    // Метод удаления первого элемента из списка
    public void removeFirst() {
        if (head != null) {
            head = head.next; // Первый узел теперь будет вторым узлом в списке
        }
    }
}
