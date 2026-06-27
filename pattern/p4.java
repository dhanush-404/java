import java.util.Scanner;
public class p4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String n=sc.nextLine();
        for(int i=0;i<=n.length()-1;i++){
            for(int j=0;j<=n.length()-1;j++){
                if(i==j || i+j==n.length()-1){
                    System.out.print(n.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}