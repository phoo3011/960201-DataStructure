package Lab01.Q4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q4: AdvQueue ---");
        AdvQueue queue = new AdvQueue(4);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("Queue size: " + queue.getSize());

        System.out.println("Front value: " + queue.getFront());
        System.out.println("Rear value: " + queue.getRear());

        System.out.println("Search 20: " + queue.search(20));

        System.out.println("Is queue full? " + queue.isFull());
        queue.enQueue(40);
        System.out.println("Is queue full? " + queue.isFull());

        queue.clear();
        System.out.println("Size after clear: " + queue.getSize());
    }
}
