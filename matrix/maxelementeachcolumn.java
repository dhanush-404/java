import java.util.Scanner;
public class maxelementeachcolumn{
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
        for(int i=0;i<c;i++){
            int max=a[0][i];
            for(int j=0;j<r;j++){
                if(a[j][i]>max){
                    max=a[j][i];
                }
            }
            System.out.println("The largest element in column - "+i+" : "+max);
        }
    }
}