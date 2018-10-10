import LinkedList.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(12);
        list.addLast(new int[1][2]);
        list.addLast("toan");
        list.addLast(1232);
        list.addLast("dep");
        list.addLast("trai");
        list.addLast(10.993493);
        list.addLast(10);
        list.printList();

        list.remove((Integer)10);
        list.printList();
        System.out.println(list.isRound());







    }
}
