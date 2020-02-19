package com.epam.interest;
import java.util.Scanner;
import compoundinterest.Compoundinterest;
import simpleinterest.Simpleinterest;
public class App {
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
     System.out.println("Calculate Simple intrest and Compound interest ");
     System.out.println("1.Simple intrest");
     System.out.println("2.Compound intrest");
     System.out.println("Select the option");
     int ch = ob.nextInt();
      System.out.println();
     if(ch==1)
      {
       Simpleinterest.simpleinterestcalculation();
      }
       if(ch==2)
     {
       Compoundinterest.compoundinterestcalculation();
     }
}
}