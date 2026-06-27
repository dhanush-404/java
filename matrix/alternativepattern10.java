import java.util.Scanner;
public class alternativepattern10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                int top=i,bottom=s-i-1;
                int left=j,right=s-j-1;
                int layer=top;
                if(left<layer){
                    layer=left;
                }
                
                if(bottom<layer){
                    layer=bottom;
                }
                if(right<layer){
                    layer=right;
                }
                if(layer%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}