import java.util.Scanner;
public class additionofmatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int r=sc.nextInt();
        System.out.print("Enter the size of the column : ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("Enter the matrix 1 elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - ["+i+"]"+"["+j+"] :");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the matrix 2 elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - ["+i+"]"+"["+j+"] :");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix1 ELements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matrix2 ELements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Addition of two matrices :  ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }

    }
}