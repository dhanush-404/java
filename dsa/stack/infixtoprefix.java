import java.util.*;
public class infixtoprefix{
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
        String postfix="";
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                postfix+=ch;
            }
            else if(ch=='('){
                push(ch);
            }
            else if(ch==')'){
                while(peek()!='('){
                    postfix+=pop();
                }
                pop();
            }
            else{
                while(isEmpty()==0 && precedence(peek())>=precedence(ch)){
                    postfix+=pop();
                }
                push(ch);
            }
        }
        while(isEmpty()==0){
            postfix+=pop();
        }
        String prefix="";
            for(int j=postfix.length()-1;j>=0;j--){
                prefix+=postfix.charAt(j);
            }
            System.out.println("Prefix Expression : " + prefix);
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a infix expression : ");
        String ex=sc.nextLine();
        String exp="";
        for(int i=ex.length()-1;i>=0;i--){
            exp=exp+ex.charAt(i);
        }
        String temp="";
        for(int i=0;i<ex.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                temp+=')';
            }
            else if(ch==')'){
                temp+='(';
            }
            else{
                temp+=ch;
            }
        }
        infixtoprefix obj=new infixtoprefix();
        obj.convert(temp);
    }
}