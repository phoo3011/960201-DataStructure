package Lab03.Q6;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") || token.equals("%");
    }

    public static String toPostfix(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = tokens.length - 1; i >= 0; i--) {
            String t = tokens[i];
            if (isOperator(t)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(op1 + " " + op2 + " " + t);
            } else {
                stack.push(t);
            }
        }
        return stack.pop();
    }

    public static String toInfix(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = tokens.length - 1; i >= 0; i--) {
            String t = tokens[i];
            if (isOperator(t)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op1 + " " + t + " " + op2 + ")");
            } else {
                stack.push(t);
            }
        }
        return stack.pop();
    }

    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (String token : postfix.split("\\s+")) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "%": stack.push(a % b); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a prefix expression: ");
        String line = scanner.nextLine().trim();
        String[] tokens = line.split("\\s+");

        String postfix = toPostfix(tokens);
        String infix   = toInfix(tokens);
        int result     = evaluatePostfix(postfix);

        System.out.println("prefix expression:\n" + line);
        System.out.println("postfix expression:\n" + postfix);
        System.out.println("infix expression:\n" + infix);
        System.out.println("Result = " + result);
    }
}
