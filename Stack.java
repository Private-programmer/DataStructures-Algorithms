public class Stack {
    // Array based stack class.
    String[] arr;
    int top;

    // setting array size and initialising the top of the stack.
    public Stack(){
        arr = new String[10];
        top = 0;
    }


    public void printStack(){
        System.out.println("|     top     |");
        for(int i = top-1; i > -1; i--){
            System.out.println("| " + arr[i] + " |");
        }
        System.out.println("  -----------  ");
    }

    // checking for empty stack
    public boolean isEmpty(){
        return(top == 0);
    }

    // pushing onto the stack 
    public void push(String s){
        arr[top] = s;
        top = top + 1;
    }


    // popping off the stack
    public String pop(){
        top = top -1;
        return arr[top];
    }
}