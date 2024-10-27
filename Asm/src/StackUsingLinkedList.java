// Node class to represent each element in the stack
class Node {
    int data;        // Data to store in the node
    Node next;       // Reference to the next node in the stack

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class implementing the stack using a linked list
public class StackUsingLinkedList {
    private Node top;  // Reference to the top node in the stack

    // Constructor to initialize an empty stack
    public StackUsingLinkedList() {
        top = null;
    }

    // Push: Add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Link the new node to the previous top
        top = newNode;      // Update top to the new node
        System.out.println(data + " pushed to stack");
    }

    // Pop: Remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data; // Get the data at the top
        top = top.next;      // Move top to the next node
        System.out.println(data + " popped from stack");
        return data;
    }

    // Peek: Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty: Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method to demonstrate stack functionality
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Checking the top element
        System.out.println("Top element is " + stack.peek());

        // Popping elements from the stack
        stack.pop();
        stack.pop();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Popping the last element
        stack.pop();
        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty());
    }
}
