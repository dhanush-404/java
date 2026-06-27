import java.util.*;
public class common{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the size of the column : ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the matrix elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int idx=0;
        int res[]=new int[c];
        for(int i=0;i<c;i++){
            int x=a[0][i];
            boolean dup=false;
            for(int j=0;j<i;j++){
                if(a[0][j]==x){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                int count=1;
                for(int k=1;k<r;k++){
                    boolean found=false;
                    for(int l=0;l<c;l++){
                        if(a[k][l]==x){
                            found=true;
                            break;
                        }
                    }
                    if(found){
                        count++;
                    }

                }
                if(count==r){
                    res[idx]=x;
                    idx++;
                }

            }
        }
        Arrays.sort(res,0,idx);
        for(int i=0;i<idx;i++){
            System.out.print(res[i]+" ");
        }
    }
}