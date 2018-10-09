import sun.awt.image.ImageWatched;

public class Test {
    public static void main(String[] args) {
        Linked list = new Linked(12);
        list.addLast(new int[1][2]);
        list.addLast("toan");
        list.addLast(1232);
        list.addLast("dep");
        list.addLast("trai");
        list.addLast(10.993493);
        list.printList();

        list.remove("trai");
        list.printList();

        Linked clone = list.clone();
        clone.printList();
        System.out.println(clone.indexOf(12));






    }
}
