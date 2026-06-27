import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();

        }
        int start =0,end = s-1;

        System.out.print("Half Reverse of the array : ");
        int mid=s/2;
        for(int i=mid;i>=0;i--){
            System.out.print(a[i]+" ");
        }
         for(int i=end;i>=mid+1;i--){
            System.out.print(a[i]+" ");
        }
    }
}