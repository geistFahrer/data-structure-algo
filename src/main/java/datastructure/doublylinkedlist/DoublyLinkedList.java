package main.java.datastructure.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value);
            if (temp.next !=null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }


}
