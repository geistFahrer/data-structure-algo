package main.java.datastructure.doublylinkedlist;

public class Main {
    public static void main(String... args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        System.out.println("------Append-----");
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.print();

        System.out.println("---------Remove last-----------");
        doublyLinkedList.removeLast();
        doublyLinkedList.print();
        doublyLinkedList.removeLast();
        doublyLinkedList.print();
        doublyLinkedList.removeLast();
        doublyLinkedList.print();
        doublyLinkedList.removeLast();
        doublyLinkedList.print();

        System.out.println("----------Prepend--------------");
        doublyLinkedList.prepend(1);
        doublyLinkedList.print();
        doublyLinkedList.prepend(2);
        doublyLinkedList.prepend(3);
        doublyLinkedList.print();

        System.out.println("----------Remove first--------------");
        doublyLinkedList.removeFirst();
        doublyLinkedList.print();
        doublyLinkedList.removeFirst();
        doublyLinkedList.print();
        doublyLinkedList.removeFirst();
        doublyLinkedList.print();
        doublyLinkedList.removeFirst();
        doublyLinkedList.print();
    }
}
