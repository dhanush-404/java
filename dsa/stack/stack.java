public class stack{
    int size;
    int top=-1;
    int stack[];
    int revstack[];
    stack(int size){
        this.size=size;
        stack=new int[size];
        revstack=new int[size];
    }
    int isEmpty(){
        if(top==-1){
            return 1;
        }
        return 0;
    }
    int isFull(){
        if(top==size-1){
            return 1;
        }
        return 0;
    }
    void push(int data){
        if(isFull()==1){
            System.out.println("Stack is full(Overflow)");
        }
        else{
            top++;
            stack[top]=data;
        }
    }
    void pop(){
        if(isEmpty()==1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element : "+stack[top]+" is removed");
            top--;
        }
    }
    void display(){
        if(isEmpty()==1){
            System.out.println("Stack is empty (underflow)");
        }
        else{
            System.out.print("top-> ");
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" > ");
            }
            System.out.print("end\n");
        }
    }
    void peek(){
        if(isEmpty()==1){
            System.out.print("Nothing to peek fool");
        }
        else{
            System.out.println("Peek Element : "+stack[top]);
        }
    }
    void revstack(){
        if(isEmpty()==1){
            System.out.print("The stack is going to be reversed is empty");
            return;
        }
        int revtop=-1;
        for(int i=top;i>=0;i--){
            revtop++;
            revstack[revtop]=stack[i];
        }
        System.out.print("Reverse of the Stack :\ntop-> " );
        for(int i=revtop;i>=0;i--){
            System.out.print(revstack[i]+" > ");
        }
        System.out.print("end");
    }
    public static void main(String args[]){
        stack obj=new stack(10);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.pop();
        obj.display();
        obj.peek();
        obj.revstack();
        
    }
}