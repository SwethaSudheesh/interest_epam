package constructioncost;
import java.util.Scanner;
import java.io.*;
import com.epam.interest.*;
public class Constructioncost extends App {
public static void costcalculation() {
Scanner ob = new Scanner(System.in);
int a[]= {1200,1500,1800,2500};
PrintStream pout=new PrintStream(System.out);  
pout.println("Enter the length of Rectangle:");
int length = ob.nextInt();
pout.println("Enter the width of Rectangle:");
int width = ob.nextInt();
int area = length*width;
pout.println("Enter the type of material to be used");
pout.println("1. Standard materials");
pout.println("2. Above standard materials");
pout.println("3. High standard material");
pout.println("4. High standard material and fully automated house");
int ch = ob.nextInt();

pout.println("Total construction cost : " +area*a[ch-1]);
pout.flush();
ob.close();
}
}