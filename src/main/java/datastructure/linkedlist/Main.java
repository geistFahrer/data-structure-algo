package main.java.datastructure.linkedlist;

public class Main {
    public static void main(String... args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Getting index 2 element of empty linked list.");
        linkedList.get(2);

        System.out.println("Getting index 0 element of linked list with length 1.");
        linkedList.append(1);
        LinkedList.Node node = linkedList.get(0);
        System.out.println("Oth element of linked list is " + node.value);

        System.out.println("Getting index 2 element of linked list with length 4.");
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        node = linkedList.get(2);
        System.out.println("3rd element of linked list is " + node.value);


    }
}
