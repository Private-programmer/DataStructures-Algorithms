public class Queues {
    String[] arr;
    int front;
    int back;
    
    public Queues(){
        arr = new String[10];
        front = 0;
        back = 0;
    }


    public void printQueue(){
        for(int f = front, b = back; b != f ; b--){
            System.out.println("+---------------------+");
            System.out.println("|  " + arr[b] + "     |");
            System.out.println("+---------------------+");
            System.out.println();
        }
    }


    public void enqueue(String s){
        back = back + 1;
        arr[back] = s; 
    }
    
    
    public String denueue(){
        String s = arr[front];
        front = front + 1; 
        return s;
    }
}