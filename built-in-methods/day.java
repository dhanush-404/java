import java.util.Calendar;
import java.util.Scanner;
public class day{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Calendar cal=Calendar.getInstance();
        System.out.print("Enter the value(DD/MM/YYYY) : ");
        String val=sc.nextLine();
        String date,month,year;
        date=val.substring(0,2); 
        month=val.substring(3,5);
        year=val.substring(6);
        int d,m,y;
        d=Integer.parseInt(date);
        m=Integer.parseInt(month);
        y=Integer.parseInt(year);
        cal.set(y, m-1, d);      
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int day=cal.get(Calendar.DAY_OF_WEEK);
        System.out.print("Day : "+days[day-1]);

    }
}
