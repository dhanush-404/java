import java.util.*;
public class Main{
    public static void main(String[]args){
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);

        System.out.println(stack.peek());    
        System.out.print(stack);
        System.out.print(stack.reversed());
        System.out.print(stack);
    }
}