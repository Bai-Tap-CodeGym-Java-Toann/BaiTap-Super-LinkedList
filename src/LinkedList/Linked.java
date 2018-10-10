package LinkedList;

public abstract class Linked {

    public class Node {
        protected Node next = null;
        protected Object data;

        protected Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    abstract Node getHead();

    abstract void add(int index, Object data);

    abstract boolean remove(Object data);

    abstract boolean remove(int index);

    abstract void clear();

    abstract void printList();

    abstract int size();

    abstract Node getNode(int index);

    abstract boolean isContain(Object data);

    public boolean isRound() {
        if (!(getNode(size() - 1).next == null)) {
            if (getNode(size() - 1).next.equals(getHead())) {
                return true;
            }
        }
        return false;
    }
}
