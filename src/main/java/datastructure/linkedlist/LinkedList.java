package main.java.datastructure.linkedlist;

/**
 * Singly linked list class.
 */
public class LinkedList {
    /**
     * Node pointing to head of the linked list.
     */
    private Node head;
    /**
     * Node pointing to tail of the linked list.
     */
    private Node tail;
    /**
     * Length of the linked list.
     */
    private int length;

    /**
     * Constructor to initiate empty linked list.
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * Constructor to initiate linked list with one element.
     *
     * @param value Value of the first node of the linked list.
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getHead() {
        System.out.println("Head is : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail is : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length is : " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void removeLast() {
        if (length == 0) {
            return;
        }
        Node pre, temp;
        pre = head;
        temp = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        // Length is zero means linked list is empty
        if (length == 0) {
            head = tail = null;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        // When linked list has only one element and that is removed then tail should point to null.
        if(length == 0) {
            tail = null;
        }
        return temp;
    }


}
