package Lab02.Q1;

public class BasicLinkedList {
    protected MyNode head;

    public BasicLinkedList() {
        this.head = null;
    }

    public void addFirst(int x) {
        MyNode newNode = new MyNode(x);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNextNode();
        } else {
            System.out.println("Warning: List is empty. Cannot remove.");
        }
    }

    public int getFirst() {
        if (head != null) {
            return head.getElement();
        }
        System.out.println("Warning: List is empty.");
        return -1;
    }

    public void printAll() {
        MyNode current = head;
        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }

    public int getSize() {
        int count = 0;
        MyNode current = head;
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }
}
