package compoundinterest;
import java.util.Scanner;
import com.epam.interest.*;
public class Compoundinterest extends App {
public static void compoundinterestcalculation()
{
int principalinvestment,rateofinterest,numberoftimescompounded,time;
Scanner object =new Scanner(System.in);
System.out.println("Enter the principal investment amount (the initial deposit or loan amount) (p)");
principalinvestment = object.nextInt();

System.out.println("Enter the annual interest rate (in decimal) (r)");
rateofinterest = object.nextInt();

System.out.println("Enter the number of times that interest is compounded per unit time (n)");
numberoftimescompounded = object.nextInt();

System.out.println("enter the time the money is invested or borrowed for (t)");
time = object.nextInt();

object.close();
int finalamount = (principalinvestment* (1 + rateofinterest/numberoftimescompounded))^ (numberoftimescompounded*time);

System.out.println(finalamount);

}
}
