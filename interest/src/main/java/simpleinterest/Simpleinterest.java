package simpleinterest;
import java.io.PrintStream;
import java.util.Scanner;
import com.epam.interest.*;
public class Simpleinterest extends App{
public static int simpleinterestcalculation()
{
int principalamount,rateperannum,timeinyears;
Scanner object=new Scanner(System.in);
PrintStream pout=new PrintStream(System.out); 
pout.println("enter the value of initial amount of the loan taken");
principalamount = object.nextInt();

pout.println("enter the of rate of interest");
rateperannum = object.nextInt();

pout.println("enter the of term of loan in deposit (time in years)");
timeinyears = object.nextInt();

int totalsimpleintrest = (principalamount * rateperannum *timeinyears)/100;
object.close();

return totalsimpleintrest;

}
}
