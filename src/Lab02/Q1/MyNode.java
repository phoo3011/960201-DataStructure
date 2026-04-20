package Lab02.Q1;

public class MyNode {
    private int element;
    private MyNode next;

    public MyNode(int x) {
        this.element = x;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int x) {
        this.element = x;
    }

    public MyNode getNextNode() {
        return next;
    }

    public void setNextNode(MyNode x) {
        this.next = x;
    }
}
