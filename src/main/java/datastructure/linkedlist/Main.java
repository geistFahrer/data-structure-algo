package main.java.datastructure.linkedlist;

public class Main {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Prepend 3.");
        linkedList.prepend(3);
        linkedList.print();
        System.out.println("Prepend 2.");
        linkedList.prepend(2);
        linkedList.print();
        System.out.println("Prepend 1.");
        linkedList.prepend(1);
        linkedList.print();
        System.out.println("Prepend 0.");
        linkedList.prepend(0);
        linkedList.print();
    }
}
