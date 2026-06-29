import java.util.Scanner;
public class builtinmath{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.println("Absolute diference : "+Math.abs(n1-n2));
        System.out.println("Max : "+Math.max(n1,n2));
        System.out.println("Min : "+Math.min(n1,n2));
        System.out.println("Pow : "+Math.pow(n1,n2));
        System.out.println("Square root : "+Math.sqrt(n1));
        System.out.println("Cube root : "+Math.cbrt(n2));
        System.out.println("Ceil : "+Math.ceil(n1));
        System.out.println("Floor : "+Math.floor(n2));
        System.out.println("Random value : "+Math.random());
        System.out.println("Round : "+Math.round(n1));
    }
}