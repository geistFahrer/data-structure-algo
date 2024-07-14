package main.java.datastructure.stack;

public class Stack {
    Node top;
    int height;

    public Stack(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void print() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
        height++;
    }

    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
