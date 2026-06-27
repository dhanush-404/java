public class queue{
    int size=100;
    int queue[]=new int[size];
    int front=-1;
    int rear=-1;
    int isFull(){
        if(rear==size-1){
            return 1; 
        }
        else{
            return 0;
        }
    }
    int isEmpty(){
        if(front==-1 && rear==-1){
            return 1;
        }
        return 0;
    }
    void enqueue(int data){
        if(isFull()!=1){
            if(front==-1){
                queue[++rear]=data;
                front++;
            }
            else{
                queue[++rear]=data;
                
            }
        }
        else{
            System.out.println("Queue is Empty");
        }
    }
    void dequeue(){
        if(isEmpty()==1){
            System.out.println("Queue is Empty");
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
    void peek(){
        System.out.println("Rear Element : "+queue[rear]);
    }
    void disp(){
        System.out.print("\nfront->");
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" : ");
        }
        System.out.print("<-rear\n");
    }
    public static void main(String[] args) {
        queue obj=new queue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.disp();
        obj.dequeue();
        obj.disp();
    }
}
