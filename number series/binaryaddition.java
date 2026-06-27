import java.util.Scanner;

public class binaryaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int decimal = 0;
        int base = 1;

        // Convert first binary to decimal
        while (b1 > 0) {
            int ld = b1 % 10;
            decimal = decimal + (ld * base);
            base *= 2;
            b1 = b1 / 10;
        }

        // Convert second binary to decimal
        int d2 = 0;
        int b = 1;

        while (b2 > 0) {
            int l = b2 % 10;
            d2 = d2 + (l * b);
            b *= 2;
            b2 = b2 / 10;
        }

        // Add the decimal values
        int num = decimal + d2;

        // Convert sum back to binary
        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        System.out.print(binary);
    }
}
