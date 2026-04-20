package Lab01.Q2;

import Lab01.Q1.MyStack;

public class AdvStack extends MyStack {

    public AdvStack(int size) {
        super(size);
    }

    public int peak() {
        if (top < 0) {
            System.out.println("Warning: Stack is empty.");
            return -1;
        }
        return list[top];
    }

    public boolean search(int x) {
        for (int i = 0; i <= top; i++) {
            if (list[i] == x) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        top = -1;
    }

    public void doublePop() {
        if (top < 1) {
            System.out.println("Warning: Not enough elements to double pop.");
        } else {
            pop();
            pop();
        }
    }

    public void doublePush(int x, int y) {
        push(x);
        push(y);
    }
}
