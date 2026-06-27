import java.util.*;
public class snakematrice{
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=1;j<=n;j++){
                    System.out.print(temp+" ");
                    temp++;
                }

            }
            else{
                int temp2=temp+n-1;
                for(int j=1;j<=n;j++){
                    System.out.print(temp2+" ");
                    temp2--;
                }
                temp+=n;
            }
            System.out.println();
        }
    }
}