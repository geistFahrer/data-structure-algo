package main.java.datastructure.stack;

public class Main {
    public static void main (String... args) {
        System.out.println("Created stack");
        Stack stack = new Stack(2);
        stack.print();

        System.out.println("Pushed 3 and 5 in the stack");
        stack.push(3);
        stack.push(5);
        stack.print();

        System.out.println("Popping elements from stack");
        Stack.Node node = stack.pop();
        System.out.println(node.value);
        node = stack.pop();
        System.out.println(node.value);
        node = stack.pop();
        System.out.println(node.value);
        node = stack.pop();
        System.out.println("Popped node when stack is empty: " + node);
    }
}
