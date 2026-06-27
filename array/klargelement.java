import java.util.*;
public class klargelement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The k largest elements are:");
        System.out.print(arr[n-k]+" ");
        

    }
}