import java.util.Scanner;
public class symmetricmatrixcheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int s=sc.nextInt();
        int a[][]=new int[s][s];
        int t[][]=new int[s][s];
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
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                t[i][j]=a[j][i];
            }
        }
        String check="TRUE";
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(a[i][j]!=t[i][j]){
                    check="FALSE";
                    break;
                }
            }
        }
        System.out.println("The Symmetric matrix check : "+check);
    }
}