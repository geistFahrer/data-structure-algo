package main.java.datastructure.linkedlist;

public class Main {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.set(1, 100);
        linkedList.print();
        linkedList.insert(1, 123);
        linkedList.print();


    }
}
