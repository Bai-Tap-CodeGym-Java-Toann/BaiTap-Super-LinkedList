package LinkedList;

public class RoundDualLinkedList extends DualLinkedList {

    public RoundDualLinkedList(Object data) {
        super(data);
        roundList();
    }
    //OVERRIDE

    @Override
    public void addFirst(Object data) {
        super.addFirst(data);
        roundList();
    }

    @Override
    public void removeFirst() {
        super.removeFirst();
        roundList();
    }

    @Override
    public void addLast(Object data) {
        super.addLast(data);
        roundList();
    }

    @Override
    public void removeLast() {
        super.removeLast();
        roundList();
    }

    //SET
    private void roundList() {
        super.tail.next = super.head;
        super.head.previous = super.tail;
    }

    public boolean setHeadPoint(int index) {
        if (index < super.numNodes && index > 1) {
            Node temp = moveToIndex(index - 1);
            super.head = moveToIndex(index);
            super.tail = temp;
            super.tail.next = super.head;
            super.head.previous = super.tail;
            return true;
        }
        return false;
    }

    public boolean setHeadPoint(Object data) {
        int index = indexOf(data);
        if (index >= 0) {
            Node temp = moveToIndex(index - 1);
            super.head = moveToIndex(index);
            super.tail = temp;
            super.tail.next = super.head;
            super.head.previous = super.tail;
            return true;
        }
        return false;
    }


}
