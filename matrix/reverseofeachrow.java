import java.util.Scanner;
public class reverseofeachrow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int r=sc.nextInt();
        System.out.print("Enter the size of the column : ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the matrix 1 elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - ["+i+"]"+"["+j+"] :");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix ELements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }                                
            System.out.println("");                                 
        }
        System.out.println("Reverse of each row :");
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                 System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}