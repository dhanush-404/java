import java.util.Scanner;
public class snakematrixprint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=1;
        for(int i=0;i<num;i++){
            if(i%2==0){
                for(int j=1;j<=num;j++){
                    System.out.print(temp+" ");
                    temp++;
                }
            }
            else{
                int temp2=temp+num-1;
                for(int j=1;j<=num;j++){
                    System.out.print(temp2+" ");
                    temp2--;
                }
                temp=temp+num;
            }
            System.out.println();
        }
    }

}