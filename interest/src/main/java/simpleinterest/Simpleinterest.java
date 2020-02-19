package simpleinterest;
import java.util.Scanner;
import com.epam.interest.*;
public class Simpleinterest extends App{
public static void simpleinterestcalculation ()
{
int principalamount,rateperannum,timeinyears;
Scanner object=new Scanner(System.in);

System.out.println("enter the value of initial amount of the loan taken");
principalamount = object.nextInt();

System.out.println("enter the of rate of interest");
rateperannum = object.nextInt();

System.out.println("enter the of term of loan in deposit (time in years)");
timeinyears = object.nextInt();

int totalsimpleintrest = (principalamount * rateperannum *timeinyears)/100;
object.close();

System.out.println(totalsimpleintrest);

}
}
