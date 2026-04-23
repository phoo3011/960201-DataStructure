package Lab03.Q2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();

        System.out.print("Enter message: ");
        String line = scanner.nextLine();
        String[] tokens = line.trim().split("\\s+");

        for (String token : tokens) {
            if (token.equals("*")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                queue.offer(token.charAt(0));
            }
        }

        if (queue.isEmpty()) {
            System.out.println("Nothing");
        } else {
            System.out.print("Result: ");
            for (char c : queue) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
