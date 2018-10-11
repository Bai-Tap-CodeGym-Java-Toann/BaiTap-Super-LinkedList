import LinkedList.*;

public class Test {
    public static void main(String[] args) {
        DualLinkedList list = new RoundDualLinkedList(12);
        System.out.println(list.isRound());
        System.out.println(Linked.isDual(list));

        list.addLast(new int[1][2]);
        list.addLast("toan");
        list.addLast(1232);
        list.addLast("dep");
        list.addLast("trai");
        list.addLast(10.993493);
        list.addLast(10);
        list.printList();



        list.printList();
        list.addLast(232323);
        list.remove(5);
        list.removeFirst();
        list.printList();
        list.reverse();
        list.printList();



    }

    static void printpack(LinkedList list) {
        System.out.println(list.getTail().getNext());
        System.out.println(list.getHead());
        System.out.println(list.isRound());
    }
}
