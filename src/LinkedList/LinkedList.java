package LinkedList;

public class LinkedList extends Linked {
    private Node head;
    private int numNodes = 1;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public void add(int index, Object data) {
        Node temp = moveToIndex(index - 1);
        if (temp == null) {
            temp = moveToLastNode();
        }
        Node current = temp.next;
        temp.next = new Node(data);
        temp.next.next = current;
        numNodes++;
    }

    @Override
    public boolean remove(int index) {
        if (moveToIndex(index) == null) return false;
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = moveToIndex(index - 1);
            Node current = temp.next;
            temp.next = current.next;
            current.next = null;
            numNodes--;
        }
        return true;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }


    public void addLast(Object data) {
        Node temp = moveToLastNode();
        temp.next = new Node(data);
        numNodes++;
    }

    @Override
    public boolean remove(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                if (remove(i)) {
                    return true;
                }
            }
            temp = temp.next;
        }
        return false;
    }


    public void removeFirst() {
        Node temp = head.next;
        head.next = null;
        head = temp;
        numNodes--;
    }


    public void removeLast() {
        Node temp = moveToIndex(numNodes - 2);
        temp.next = null;
        numNodes--;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Node getNode(int index) {
        return moveToIndex(index);
    }

    @Override
    public int size() {
        return numNodes;
    }

    @Override
    public void printList() {
        System.out.println("list (" + numNodes + ")");
        Node temp = head;
        int index = 0;
        while (temp != null) {
            System.out.println("element " + index + ": " + temp.data);
            temp = temp.next;
            index++;
        }
        System.out.println("\n");
    }


    private Node moveToIndex(int index) {
        Node cursor = head;
        if (index < numNodes && index >= 0) {
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
            return cursor;
        }
        return null;
    }

    private Node moveToLastNode() {
        Node cursor = head;
        while (!(cursor.next == null)) {
            cursor = cursor.next;
        }
        return cursor;
    }

    @Override
    public boolean isContain(Object data) {
        Node temp = head;
        while (!(temp == null)) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.next;

        }
        return -1;
    }

    @Override
    public LinkedList clone() {
        Node cloneCursor = head;
        LinkedList clone = new LinkedList(cloneCursor.getData());
        for (int i = 1; i < numNodes; i++) {
            cloneCursor = cloneCursor.next;
            clone.addLast(cloneCursor.getData());
        }
        return clone;
    }
}
