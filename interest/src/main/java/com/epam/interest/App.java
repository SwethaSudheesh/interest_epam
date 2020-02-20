package com.epam.interest;
import java.io.PrintStream;
import java.util.Scanner;
import compoundinterest.Compoundinterest;
import constructioncost.Constructioncost;
import simpleinterest.Simpleinterest;
public class App {
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
	PrintStream pout=new PrintStream(System.out); 
     pout.println("Calculate Simple intrest and Compound interest ");
     pout.println("1. Simple intrest");
     pout.println("2. Compound intrest");
     pout.println("3. Construction Cost");
     int ch = ob.nextInt();
      pout.println();
     if(ch==1)
      {
       pout.println(Simpleinterest.simpleinterestcalculation());
      
      }
       if(ch==2)
     {
       pout.println(Compoundinterest.compoundinterestcalculation());
     }
       if(ch==3)
       {
         pout.println(Constructioncost.costcalculation());
       }
       ob.close();
}
}