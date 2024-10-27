public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;


    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }


    public void enqueue(int data) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }


    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = queue[front]; /
        front = (front + 1) % capacity;
        size--;
        return data;
    }


    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);


        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());

        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());


        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Is queue empty after dequeueing all? " + queue.isEmpty()); // Output: true
    }
}