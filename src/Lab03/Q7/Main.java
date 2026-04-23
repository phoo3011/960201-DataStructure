package Lab03.Q7;

public class Main {
    public static void main(String[] args) {
        BasicLinkedList<Integer> intList = new BasicLinkedList<>();
        intList.addFirst(10);
        intList.addFirst(20);
        intList.addFirst(30);
        System.out.print("Integer list: ");
        intList.printAll();

        BasicLinkedList<String> strList = new BasicLinkedList<>();
        strList.addFirst("Jazz");
        strList.addFirst("Bee");
        strList.addFirst("May");
        System.out.print("String list: ");
        strList.printAll();

        BasicLinkedList<Double> dblList = new BasicLinkedList<>();
        dblList.addFirst(3.14);
        dblList.addFirst(2.71);
        System.out.print("Double list: ");
        dblList.printAll();
    }
}
