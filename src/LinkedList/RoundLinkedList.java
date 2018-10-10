package LinkedList;

public class RoundLinkedList extends LinkedList {
    private Node head;
    private int numNodes = 1;

    public RoundLinkedList(Object data) {
        super(data);
        head = new Node(data);
        head.next = head;
    }

    @Override
    public Node getHead() {
        return head;
    }
    @Override

    public void setHead(int index) {
        head = getNode(index);
    }
}
