import java.util.Scanner;
public class automorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int square=num*num;
        int n=num,c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        int ans=1;
        for(int i=1;i<=c;i++){
            ans*=10;
        }
        int ld=square%ans;
        if(ld==num){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.print("Not Automorphic Number");
        }
    }
}