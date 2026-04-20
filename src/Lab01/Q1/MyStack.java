package Lab01.Q1;

public class MyStack {
    protected int top;
    protected int[] list;

    public MyStack(int size) {
        list = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top >= list.length - 1) {
            System.out.println("Warning: Stack is full. Cannot push " + x);
        } else {
            top++;
            list[top] = x;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Warning: Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = list[top];
            top--;
            return value;
        }
    }
}
