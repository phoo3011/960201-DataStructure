package Lab01.Q2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q2: AdvStack ---");
        AdvStack stack = new AdvStack(5);

        stack.doublePush(10, 20);
        stack.push(30);

        System.out.println("Peak value: " + stack.peak());

        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Search 40: " + stack.search(40));

        stack.doublePop();
        System.out.println("Peak after doublePop: " + stack.peak());

        stack.clear();
        stack.pop();
    }
}
