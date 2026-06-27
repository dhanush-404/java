import java.util.*;
public class spiral{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int left=0,right=c-1;
        int top=0,bottom=r-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");            
            }
            top++;
            for(int j=top;j<=bottom;j++){
                System.out.print(a[j][right]+" ");
            }
            right--;
            if(top<=bottom){
            for(int k=right;k>=left;k--){
                System.out.print(a[bottom][k]+" ");
            }
            bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    System.out.print(a[l][left]+" ");
                }
                left++;
            }
        }
    }
}