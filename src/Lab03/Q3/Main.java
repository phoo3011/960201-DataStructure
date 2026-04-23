package Lab03.Q3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Binary: 0");
            scanner.close();
            return;
        }

        int temp = n;
        while (temp > 0) {
            stack.push(temp % 2);
            temp /= 2;
        }

        System.out.print("Binary of " + n + ": ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
