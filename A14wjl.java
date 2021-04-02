/*******************************************
Programmer: Will Laflamme
Date:10/15/17
Output:exception
*******************************************/
import java.io.*;//import
public class A14wjl//class declaration
{
	 public static void main(String[] args)
	 {
		 int numerator = 10;
	     int denominator = 0;

	     System.out.println("Before the attempt to divide by zero.");
	     try
	     {
	     	System.out.println(numerator / denominator);
		 }
		 catch(StringIndexOutOfBoundsException e)
		 {
	     	System.out.println("This text will not be printed.");
	     	System.out.print(e.getMessage());

		 }
	 }
 }