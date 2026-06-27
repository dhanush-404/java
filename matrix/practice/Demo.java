import java.util.*;
public class Demo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int i=0;
        while(i<word.length()){
            char ch = word.charAt(i);
            i++;
            int count = 0;
            while(i<word.length()&& word.charAt(i)>='0'&&word.charAt(i)<='9'){
                count = count*10 + word.charAt(i)-'0';
                i++;
            }
            for(int j=1;j<=count;j++){
                System.out.print(ch);
            }
        }
    }
}