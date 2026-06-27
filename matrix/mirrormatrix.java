import java.util.Scanner;
public class mirrormatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int s=sc.nextInt();
        int a[][]=new int[s][s];
        System.out.println("Enter the matrix 1 elements : ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print("Element - ["+i+"]"+"["+j+"] :");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix ELements : ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(a[i][j]+" ");
            }                                
            System.out.println("");                                 
        }
        System.out.println("after mirrored the matrix vertically : ");
        for(int i=0;i<s;i++){
            for(int j=s-1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}