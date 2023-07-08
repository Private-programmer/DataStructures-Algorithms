public class LinkedListDoubleTest {
    public static void main(String[] args) {
        LinkedListDouble item1 = new LinkedListDouble("element 1");
        LinkedListDouble item2 = new LinkedListDouble("element 2");
        LinkedListDouble item3 = new LinkedListDouble("element 3");

        item1.prev = null;
        item1.next = item2;
        item2.prev = item1;
        item2.next = item3;
        item3.prev = item2;
        item3.next = null;
        System.out.println("");
        System.out.println("----- Going Forward in Doubly Linked List -----");
        LinkedListDouble pointer = item1;
        while (pointer != null) {
            System.out.println("|                  " + pointer.val + "                   |");
            pointer = pointer.next;
        }
        System.out.println("-----------------------------------------------");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("----- Going Backwards in Doubly Linked List -----");
        LinkedListDouble pointerReverse = item3;
        while (pointerReverse != null) {
            System.out.println("|                  " + pointerReverse.val + "                   |");
            pointerReverse = pointerReverse.prev;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("");

    }
}