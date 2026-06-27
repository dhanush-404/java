import java.util.Scanner;
public class binarytohex{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary value : ");
        int n=sc.nextInt();
        int decimal=0;
        int base=1;
        while(n>0){
            int ld=n%10;
            decimal=decimal+(ld*base);
            base*=2;
            n=n/10;
        }
        System.out.println("Decimal value : "+decimal);
        String hex="0123456789ABCDEF";
        String hexadecimal="";
        int temp=decimal;
        while(temp>0){
            int ld=temp%16;
            hexadecimal=hex.charAt(ld)+hexadecimal;
            temp=temp/16;
        }
        System.out.println("HEXADECIMAL VALUE : " + hexadecimal);
        

    }
}
        