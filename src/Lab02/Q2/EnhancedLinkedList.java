package Lab02.Q2;

import Lab02.Q1.BasicLinkedList;
import Lab02.Q1.MyNode;

public class EnhancedLinkedList extends BasicLinkedList {

    public int getLast() {
        if (head == null) {
            System.out.println("Warning: List is empty.");
            return -1;
        }
        MyNode current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        return current.getElement();
    }

    public void addLast(int x) {
        MyNode newNode = new MyNode(x);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Warning: List is empty.");
            return;
        }
        if (head.getNextNode() == null) {
            head = null;
            return;
        }
        MyNode current = head;
        while (current.getNextNode().getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(null);
    }

    public boolean search(int x) {
        MyNode current = head;
        while (current != null) {
            if (current.getElement() == x) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public void remove(int x) {
        if (head == null) {
            System.out.println("Warning: List is empty.");
            return;
        }

        if (head.getElement() == x) {
            head = head.getNextNode();
            return;
        }

        MyNode current = head;
        while (current.getNextNode() != null && current.getNextNode().getElement() != x) {
            current = current.getNextNode();
        }

        if (current.getNextNode() == null) {
            System.out.println("Warning: Element " + x + " not found in the list.");
        } else {
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }
}
