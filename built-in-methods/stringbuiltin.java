import java.util.Scanner;
public class stringbuiltin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");
        String s=sc.nextLine();
        System.out.println("Length of a string : "+s.length());
        System.out.print("Enter the position of character to display : ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Index -"+n+" : "+s.charAt(n));
        System.out.print("Enter another String :");
        String s2=sc.nextLine();
        System.out.println("String 1 is equals to String 2 : "+s.equals(s2));
        System.out.println("String 1 is equals to String 2(Ignore Case) : "+s.equalsIgnoreCase(s2));
        System.out.print("Enter the start and end position to display : ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.nextLine();
        System.out.println("Substring Result : "+s.substring(start,end));
        System.out.print("Enter the character to display the index : ");
        char ch=sc.next().charAt(0);
        System.out.println("Index position of a character : "+s.indexOf(ch));
        System.out.print("Enter the Character to print last index : ");
        char ch1=sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Index position of a character : "+s.lastIndexOf(ch1));
        System.out.print("Enter to string to check it contains in String 2 : ");
        String s3=sc.nextLine();
        System.out.println("Contains ? : "+s2.contains(s3));

    }
}