/*************************************
Programmer: Will Laflamme
Date:10/18/17
Exam: 1
Output:profit calculator based off inputs
*************************************/
import java.util.Scanner;//import scanner
public class E1laflamme//class declaration
{

	Scanner scan=new Scanner(System.in);//create scanner object

	public void greeting()//method
	{
		System.out.println("\tWelcome to Profit Calculator\n\n\tVersion 1.0\n\n\tDate Produced: 10/18/2017\n\n\n\tDeveloper: Will Laflamme\n");//print statement
	}

	public void setAll(String nme,double uPrice,int numSold)//method
	{
		System.out.print("Article Name: ");//print statement
		nme=scan.nextLine();//assign input to variable

		System.out.print("Enter Unit Price: $");//print statement
		uPrice=scan.nextDouble();//assign input to variable

		System.out.print("Expected number of article to be sold: ");//print statement
		numSold=scan.nextInt();//assign input to variable
	}

	public double getSalesPrice(double uP,double sT)//method
	{
		return (uP*2)+(uP*sT);//return number
	}

	public double getProfit(double sP,double uP,int nS)//method
	{
		return (sP-uP)*nS;//return number
	}
}