import java.util.Scanner;
public class spiralprint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the column : ");
        int c = sc.nextInt();
        int a[][] = new int[row][c];
        int arr[] = new int[row * c];
        int index = 0;
        int l = 0, r = c - 1;
        int t = 0, b = row - 1;
        System.out.println("Enter the matrix elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++){
                arr[index++] = a[t][i];
            }
            t++;
            for (int i = t; i <= b; i++){
                arr[index++] = a[i][r];
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--){
                    arr[index++] = a[b][i];
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--){
                    arr[index++] = a[i][l];
                }
                l++;
            }
        }

        System.out.println("Matrix Elements :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Spiral Order :");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}