package Lab01.Q3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q3: MyQueue ---");
        MyQueue queue = new MyQueue(3);

        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.enQueue(40);

        queue.deQueue();

    }
}
