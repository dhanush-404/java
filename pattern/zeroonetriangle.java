import java.util.Scanner;
public class zeroonetriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int val;
            if(i%2==1)
                val=1;
            else
                val=0;
            for(int j=1;j<=i;j++) {
                System.out.print(val+" ");
                val=1-val;
            }
            System.out.println();
        }
    }
}