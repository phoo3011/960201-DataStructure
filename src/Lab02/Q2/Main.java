package Lab02.Q2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q2: EnhancedLinkedList ---");
        EnhancedLinkedList list = new EnhancedLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.printAll();

        System.out.println("Last Element: " + list.getLast());
        System.out.println("Search 20: " + list.search(20));

        list.removeLast();
        list.printAll();

        list.remove(10);
        list.printAll();

        list.remove(40);
    }
}
