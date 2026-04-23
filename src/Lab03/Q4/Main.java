package Lab03.Q4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("James");
        list.add("Luca");
        list.add("Tang");
        list.add("John");
        list.add("Jane");
        list.add("May");
        list.add("Bee");
        list.add("Jazz");

        System.out.println(list);

        String[] toRemove = {"Luca", "May", "James"};
        for (String name : toRemove) {
            list.remove(name);
            System.out.println("Removed: " + name + " → " + list);
        }
        System.out.println("\nFinal list: " + list);
    }
}
