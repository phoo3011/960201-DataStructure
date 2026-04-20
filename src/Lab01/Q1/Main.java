package Lab01.Q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Q1: MyStack ---");
        MyStack stack = new MyStack(3);

        stack.pop();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.push(40);

        System.out.println("Pop value: " + stack.pop());
    }
}