package Lab03.Q1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        System.out.print("Reversed: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
