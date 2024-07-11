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

        System.out.println("----------Get element by index--------------");
        doublyLinkedList.append(1);
        doublyLinkedList.append(12);
        doublyLinkedList.append(4);
        doublyLinkedList.append(56);
        doublyLinkedList.append(5);
        doublyLinkedList.print();
        DoublyLinkedList.Node node = doublyLinkedList.get(0);
        System.out.println("Node value at index 0 : " + node.value);
        node = doublyLinkedList.get(3);
        System.out.println("Node value at index 3 : " + node.value);
        node = doublyLinkedList.get(2);
        System.out.println("Node value at index 2 : " + node.value);
        node = doublyLinkedList.get(1);
        System.out.println("Node value at index 1 : " + node.value);
        doublyLinkedList.get(-1);
        doublyLinkedList.get(4);

        System.out.println("----------Set element at index--------------");
        doublyLinkedList.print();
        doublyLinkedList.set(3, 101);
        doublyLinkedList.print();

        System.out.println("----------Set element at index--------------");
        doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.insert(0, 101);
        doublyLinkedList.print();
        doublyLinkedList.insert(2, 101);
        doublyLinkedList.print();
        doublyLinkedList.insert(2, 102);
        doublyLinkedList.print();
        doublyLinkedList.insert(2, 105);
        doublyLinkedList.print();
    }
}

