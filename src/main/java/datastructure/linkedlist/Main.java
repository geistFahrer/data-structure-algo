package main.java.datastructure.linkedlist;

public class Main {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Remove first when linked list is empty.");
        linkedList.removeFirst();
        linkedList.print();

        System.out.println("Remove first when linked list has 1 element.");
        linkedList.append(1);
        linkedList.removeFirst();
        linkedList.print();

        System.out.println("Remove first when linked list has 2 element.");
        linkedList.append(1);
        linkedList.append(2);
        linkedList.removeFirst();
        linkedList.print();

    }
}
