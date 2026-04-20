package Lab01.Q4;

import Lab01.Q3.MyQueue;

public class AdvQueue extends MyQueue {

    public AdvQueue(int size) {
        super(size);
    }

    public boolean search(int x) {
        if (front > rear) {
            return false;
        }
        for (int i = front; i <= rear; i++) {
            if (list[i] == x) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        front = 0;
        rear = -1;
    }

    public int getSize() {
        if (front > rear) {
            return 0;
        }
        return (rear - front) + 1;
    }

    public boolean isFull() {
        return rear >= list.length - 1;
    }

    public int getFront() {
        if (front > rear) {
            System.out.println("Warning: Queue is empty.");
            return -1;
        }
        return list[front];
    }

    public int getRear() {
        if (front > rear) {
            System.out.println("Warning: Queue is empty.");
            return -1;
        }
        return list[rear];
    }
}
