/*******************************************
Programmer: Will Laflamme
Date:9/13/17
Output:write a program that inputs three test
scores for a student from the keyboard, determines the average
*******************************************/
import java.util.Scanner;//import scanner
public class L1wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		double test1, test2, test3, average;//creating variables
		String cont;//string variable

		Scanner scan=new Scanner(System.in);//create scanner object

		do//do loop
		{
			System.out.print("Enter score #1: ");//print statement
			test1=scan.nextDouble();//assign input to variable
			System.out.print("Enter score #2: ");//print statement
			test2=scan.nextDouble();//assign input to variable
			System.out.print("Enter score #3: ");//print statement
			test3=scan.nextDouble();//assign input to variable

			average=(test1+test2+test3)/3;//formula to determine value assigned to variable

			System.out.println("Average: "+average+"\n");//print statement

			System.out.print("Would you like to average another set of test scores? Enter y for yes or n for no: ");//print statement
			cont=scan.next();//assign input to variable
			System.out.println();//print statement

		}while(cont.equals("y"));//conditions for a while loop
	}
}

