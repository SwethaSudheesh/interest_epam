package compoundinterest;
import java.io.PrintStream;
import java.util.Scanner;
import com.epam.interest.*;
public class Compoundinterest extends App {
public static int compoundinterestcalculation()
{
int principalinvestment,rateofinterest,numberoftimescompounded,time;
Scanner object =new Scanner(System.in);
PrintStream pout=new PrintStream(System.out); 
pout.println("Enter the principal investment amount (the initial deposit or loan amount) (p)");
principalinvestment = object.nextInt();

pout.println("Enter the annual interest rate (in decimal) (r)");
rateofinterest = object.nextInt();

pout.println("Enter the number of times that interest is compounded per unit time (n)");
numberoftimescompounded = object.nextInt();

pout.println("enter the time the money is invested or borrowed for (t)");
time = object.nextInt();

object.close();
int finalamount = (principalinvestment* (1 + rateofinterest/numberoftimescompounded))^ (numberoftimescompounded*time);

return finalamount;

}
}
