import java.util.Scanner;
public class rotationmatrix180{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int s=sc.nextInt();
        int a[][]=new int[s][s];
        System.out.println("Enter the matrix  elements : ");
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
        System.out.println("Matrix after 180 degree rotation clockwise : ");
        for(int i=s-1;i>=0;i--){
            for(int j=s-1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}