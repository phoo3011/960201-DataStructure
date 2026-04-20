package Lab02.Q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q1: BasicLinkedList ---");
        BasicLinkedList list = new BasicLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.printAll();
        System.out.println("Size: " + list.getSize());
        System.out.println("First Element: " + list.getFirst());

        list.removeFirst();
        list.printAll();
    }
}
