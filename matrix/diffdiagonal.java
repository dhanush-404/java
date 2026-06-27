import java.util.Scanner;
public class diffdiagonal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size matrix(NxN) : ");
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
        int d1=0,d2=0;
        for(int i=0;i<s;i++){
            d1+=a[i][i];
        }
        for(int i=0;i<s;i++){
            d2+=a[i][s-i-1];
        }
        if(d1>d2){
            System.out.print("Absolute Diagonal Difference : "+(d1-d2));
        }
        else{
            System.out.print("Absolute Diagonal Difference : "+(d2-d1));
        }

    }
}