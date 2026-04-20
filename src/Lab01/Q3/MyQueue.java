package Lab01.Q3;

public class MyQueue {
    protected int front;
    protected int rear;
    protected int[] list;

    public MyQueue(int size) {
        list = new int[size];
        front = 0;
        rear = -1;
    }

    public void enQueue(int x) {
        if (rear >= list.length - 1) {
            System.out.println("Warning: Queue is full. Cannot enqueue " + x);
        } else {
            rear++;
            list[rear] = x;
        }
    }

    public void deQueue() {
        if (front > rear) {
            System.out.println("Warning: Queue is empty. Cannot dequeue.");
        } else {
            front++;
        }
    }
}
