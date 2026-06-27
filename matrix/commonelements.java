import java.util.*;
public class commonelements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix ELements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }                                
            System.out.println("");                                 
        }
        int res[] = new int[c];
        int idx = 0;
        for(int j = 0; j < c; j++) {
            int x = a[0][j];

            boolean dup = false;
            for(int k = 0; k < j; k++) {
                if(a[0][k] == x) {
                    dup = true;
                    break;
                }
            }

            if(!dup) {
                int count = 1;

                for(int i = 1; i < r; i++) {
                    boolean found = false;

                    for(int k = 0; k < c; k++) {
                        if(a[i][k] == x) {
                            found = true;
                            break;
                        }
                    }

                    if(found)
                        count++;
                }

                if(count == r) {
                    res[idx] = x;
                    idx++;
                }
            }
        }

        if(idx == 0) {
            System.out.print("-1");
        } else {
            Arrays.sort(res, 0, idx);
            for(int i = 0; i < idx; i++)
                System.out.print(res[i] + " ");
        }
    }
}