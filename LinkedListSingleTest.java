public class LinkedListSingleTest {
    public static void main(String[] args) {
        LinkedListSingle item1 = new LinkedListSingle("element 1");
        LinkedListSingle item2 = new LinkedListSingle("element 2");
        LinkedListSingle item3 = new LinkedListSingle("element 3");

        item1.next = item2;
        item2.next = item3;


        LinkedListSingle pointer = item1;
        while(pointer != null){
             System.out.println(pointer.val);
             pointer = pointer.next;
        } 

        // System.out.println(item1.val);
        // System.out.println(item1.next.val);
        // System.out.println(item1.next.next.val);

    }
}
