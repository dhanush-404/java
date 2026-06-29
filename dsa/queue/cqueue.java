import java.util.Scanner;
public class cqueue{
    int size=10;
    int cqueue[]=new int[size];
    int front =-1,rear=-1;
    int isEmpty() {
        if (front==-1)
            return 1;
        return 0;
    }
    int isFull() {
        if((rear+1)%size==front)
            return 1;
        return 0;
    } 
    void enqueue(int data){
        if(isFull()==1) {
            System.out.println("Queue is Full");
            return;
        }
        else if(isEmpty()==1){
            front=0;
            rear=0;
        } 
        else{
            rear=(rear+1)%size;
        }
        cqueue[rear]=data;
        System.out.println(data+" inserted");
    }
    void dequeue(){
        if (isEmpty()==1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(cqueue[front]+" deleted");
        if (front==rear) {
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%size;
        }
    }
    void peek(){
        if (isEmpty()==1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element : "+cqueue[front]);
    }
    void display(){
        if (isEmpty()==1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue : ");
        int i=front;
        while(true) {
            System.out.print(cqueue[i] + " ");
            if (i==rear)
                break;
            i=(i+1)%size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cqueue q=new cqueue();
        while(true){
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter Element : ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}