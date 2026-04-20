package Lab02.Q3;

import Lab02.Q1.BasicLinkedList;
import Lab02.Q1.MyNode;

public class LinkedListWithThird extends BasicLinkedList {

    public int getThird() {
        if (getSize() < 3) {
            System.out.println("Warning: The list has fewer than 3 elements.");
            return -1;
        }
        return head.getNextNode().getNextNode().getElement();
    }

    public void addThird(int x) {
        if (getSize() < 2) {
            System.out.println("Warning: Cannot add as third. The list needs at least 2 elements.");
            return;
        }
        MyNode newNode = new MyNode(x);
        MyNode secondNode = head.getNextNode();

        newNode.setNextNode(secondNode.getNextNode());
        secondNode.setNextNode(newNode);
    }

    public void removeThird() {
        if (getSize() < 3) {
            System.out.println("Warning: Cannot remove third. The list has fewer than 3 elements.");
            return;
        }
        MyNode secondNode = head.getNextNode();

        secondNode.setNextNode(secondNode.getNextNode().getNextNode());
    }
}
