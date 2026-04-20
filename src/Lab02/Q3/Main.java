package Lab02.Q3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q3: LinkedListWithThird ---");
        LinkedListWithThird list = new LinkedListWithThird();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.printAll();

        System.out.println("Third Element: " + list.getThird());

        list.addThird(25);
        list.printAll();

        list.removeThird();
        list.printAll();
    }
}