package Lab03.Q7;

public class BasicLinkedList<T> {
    protected GenericNode<T> head;

    public BasicLinkedList() {
        this.head = null;
    }

    public void addFirst(T x) {
        GenericNode<T> newNode = new GenericNode<>(x);
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

    public T getFirst() {
        if (head != null) return head.getElement();
        System.out.println("Warning: List is empty.");
        return null;
    }

    public void printAll() {
        GenericNode<T> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }

    public int getSize() {
        int count = 0;
        GenericNode<T> current = head;
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }
}
