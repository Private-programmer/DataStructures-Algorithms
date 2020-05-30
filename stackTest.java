public class stackTest {

    // visualising.
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("first item");
        stack.push("second item");
        stack.push("third item");
        stack.printStack();

        System.out.println();
        String popBox = stack.pop();
        System.out.println("popped off: ");
        System.out.println();
        stack.printStack();


        // System.out.println("Pop box  ----> "popBox);
    }
    
}