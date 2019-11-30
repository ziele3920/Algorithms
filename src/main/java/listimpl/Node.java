package listimpl;

public class Node<T> {
    private T value;  // pierwszy element pary
    private Node<T> nextNode;  // drugi element ,,pary", tworzony jest nowy węzeł, który wskazuje na kolejną parę

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode=nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
