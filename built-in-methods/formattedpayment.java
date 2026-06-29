import java.text.*;
import java.util.*;
public class formattedpayment{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the payment value : ");
        double payment=sc.nextDouble();
        NumberFormat usformat=NumberFormat.getCurrencyInstance(Locale.US);
        Locale india = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat indiaformat=NumberFormat.getCurrencyInstance(india);
        NumberFormat franceformat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat chinaformat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String us,in,ch,fr;
        us=usformat.format(payment);
        in=indiaformat.format(payment);
        fr=franceformat.format(payment);
        ch=chinaformat.format(payment);
        System.out.println("INDIA : "+in);
        System.out.println("US: "+us);
        System.out.println("CHINA : "+ch);
        System.out.println("FRANCE : "+fr);
    }
}