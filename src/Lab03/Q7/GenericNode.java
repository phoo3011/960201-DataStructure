package Lab03.Q7;

public class GenericNode<T> {
    private T element;
    private GenericNode<T> next;

    public GenericNode(T element) {
        this.element = element;
        this.next = null;
    }

    public T getElement() {
        return element; }
    public GenericNode<T> getNextNode() {
        return next; }
    public void setNextNode(GenericNode<T> next) {
        this.next = next; }
}
