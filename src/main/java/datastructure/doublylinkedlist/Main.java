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
    }
}
