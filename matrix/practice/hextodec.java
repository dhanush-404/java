import java.util.*;
public class hextodec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String hex=sc.nextLine();
        int dec=Integer.to(hex,2);
        System.out.println(dec);
    }
}