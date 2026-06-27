import java.util.*;
public class infixtopostfix{
    int size=100;
    char stack[]=new char[size];
    int top=-1;
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
    void push(char ch){
        if(isFull()==1){
            System.out.println("Limit exceeded !!");
        }
        else{
            top++;
            stack[top]=ch;
        }
    }
    char pop(){
        if(isEmpty()==1){
            return '\0';
        }
        char temp=stack[top];
        top--;
        return temp;
    }
    char peek(){
        if(top==-1){
            return '\0';
        }
        return stack[top];
    }
    int precedence(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='/' || ch=='*'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        return 0;
    }
    void convert(String exp){
        System.out.print("Postfix Expression : ");
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='B') || (ch>='0' && ch<='9')){
                System.out.print(ch);
            }
            else if(ch=='('){
                push(ch);
            }
            else if(ch==')'){
                while(peek()!='('){
                    System.out.print(pop());
                }
                pop();
            }
            else{
                while(isEmpty()==0 && precedence(peek())>=precedence(ch)){
                    System.out.print(pop());
                }
                push(ch);
            }

        }
        while(isEmpty()==0){
            System.out.print(pop());
        }
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a infix expression : ");
        String exp=sc.nextLine();
        infixtopostfix obj=new infixtopostfix();
        obj.convert(exp);
    }
}