import java.util.Arrays;
import java.util.Scanner;
public class builtinarrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={10,9,1,8,2,5,3};
        System.out.println("Non readable format of array : "+a);
        System.out.println("Array 1 is displayed in readable format using toString() :"+Arrays.toString(a));
        int b[]={10,20,30};
        System.out.println("Array 2 : "+Arrays.toString(b));
        System.out.println("The two arrays are equal ?: "+Arrays.equals(a, b));
        Arrays.sort(a);
        System.out.println("Sorted Array : "+Arrays.toString(a));
        System.out.print("Enter the element to be searched(Binary search) : ");
        int key=sc.nextInt();
        sc.nextLine();
        System.out.println("Element is founded at index : "+Arrays.binarySearch(a, key));
        System.out.print("Enter a number to be filled in a array : ");
        int n=sc.nextInt();
        int c[]=new int[5];
        Arrays.fill(c, n);
        System.out.println("Filled array : "+Arrays.toString(c));
    }
}