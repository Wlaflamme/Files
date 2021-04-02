/*******************************************
Programmer: Will Laflamme
Date:10/6/17
Output:converts kilos to pounds
*******************************************/
import java.util.Scanner;//import scanner
public class A6_1wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		double kilo;//double variable

		Scanner scan=new Scanner(System.in);//create scanner object

		convert calc=new convert();//create convert object

		System.out.print("Enter kilogram: ");//print statement
		kilo=scan.nextDouble();//assign input to variable

		calc.setKilo(kilo);//use method

		System.out.println(calc.getKilo()+"kg is "+calc.getPnd()+"lbs");//print statement
	}
}