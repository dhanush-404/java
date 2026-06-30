import java.util.Scanner;
public class characterbuiltin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=sc.next().charAt(0);
        System.out.println("IS DIGIT : "+Character.isDigit(ch));
        System.out.println("IS LETTER : "+Character.isLetter(ch));
        System.out.println("IS UPPERCASE : "+Character.isUpperCase(ch));
        System.out.println("IS LOWERCASE : "+Character.isLowerCase(ch));
        System.out.println("IS WHITESPACE : "+Character.isWhitespace(ch));
        System.out.println("IS CHARACTER OR DIGIT : "+Character.isLetterOrDigit(ch));
        System.out.println("GET NUMERIC VALUE  : "+Character.getNumericValue(ch));
        System.out.println("TO LOWERCASE: "+Character.toLowerCase(ch));
        System.out.println("TO UPPERCASE : "+Character.toUpperCase(ch));
        

    }
}