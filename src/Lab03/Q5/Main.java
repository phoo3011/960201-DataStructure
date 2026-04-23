package Lab03.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            scanner.close();
            return;
        }

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            int distance = Math.abs(i - mid);
            int spaces = distance;
            int plusses = n - 2 * distance;

            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int p = 0; p < plusses; p++) System.out.print("+");
            System.out.println();
        }
    }
}
