package main.java.datastructure.linkedlist;

public class Main {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Remove last when linked list has 3 node.");
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.removeLast();
        linkedList.print();

        System.out.println("\nRemove last when linked list has 2 node.");
        linkedList.removeLast();
        linkedList.print();

        System.out.println("\nRemove last when linked list has 1 node.");
        linkedList.removeLast();
        linkedList.print();

        System.out.println("\nRemove last when linked list is empty.");
        linkedList.removeLast();
        linkedList.print();






    }
}
