import java.util.Scanner;
public class boundaryelements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
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
        System.out.print("\nBoundary Elements : ");
        for (int j = 0; j < c; j++) {
            System.out.print(a[0][j] + " ");
        }
        for (int i = 1; i < r - 1; i++) {
            System.out.print(a[i][c - 1] + " ");
        }
        if (r > 1) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(a[r - 1][j] + " ");
            }
        }
        if (c > 1) {
            for (int i = r - 2; i >= 1; i--) {
                System.out.print(a[i][0] + " ");
            }
        }
    }
}