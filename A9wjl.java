/*******************************************
Programmer: Will Laflamme
Date:10/20/17
Output:calculates sales price of items
*******************************************/
import java.util.Scanner;//import scanner
import java.text.DecimalFormat;//import format
public class A9wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		int num;//variable
		double price=0;//variable
		double sPrice=0;//variable

		Scanner scan=new Scanner(System.in);//create scanner object
		DecimalFormat form=new DecimalFormat("##0.00");//create format object

		System.out.print("How many Items do you have? ");//print statement
		num=scan.nextInt();//assign input to variable

		System.out.println();//print statement

		double[]item=new double[num];//create array

		for(int i=0;i<item.length;i++)//for loop
		{
			System.out.print("Enter the original price of item"+(i+1)+": $");//print statement
			item[i]=scan.nextDouble();//assign input to array
		}

		System.out.println();//print statement

		for(int i=0;i<item.length;i++)//for loop
		{
			sPrice=item[i]+(item[i]*.05);//assign number to variable

			System.out.println("Sale Price of item "+(i+1)+" inculding tax: $"+form.format(sPrice));//print statement
		}

		System.out.println();//print statement
	}
}