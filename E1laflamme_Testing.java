/*************************************
Programmer: Will Laflamme
Date:10/18/17
Exam: 1
Output:profit calculator based off inputs
*************************************/
import java.util.Scanner;//import scanner
import java.text.DecimalFormat;//import format
public class E1laflamme_Testing//class declaration
{
	public static void main(String[]args)//main method
	{
		double sPrice=0;//double variable
		double uPrice=0;//double variable
		double artProfit=0;//double variable
		int numSold=0;//int variable
		double sTax=0.05;//double variable
		double tProfit=0;//double variable
		String nme="";//string nme
		String l;//string l
		char cont;//char variable

		Scanner scan=new Scanner(System.in);//create scanner object

		DecimalFormat form=new DecimalFormat("##0.00");//create format object

		E1laflamme blub=new E1laflamme();//create e1laflamme object

		blub.greeting();//call greeting method

		do//do loop
		{

			System.out.print("\nArticle Name: ");//print statement
			nme=scan.next();//assign input to variable

			System.out.print("Enter Unit Price: $");//print statement
			uPrice=scan.nextDouble();//assign input to variable

			System.out.print("Expected number of article to be sold: ");//print statement
			numSold=scan.nextInt();//assign input to variable

			sPrice=blub.getSalesPrice(uPrice,sTax);//assign getSalesPrice method to variable

			artProfit=blub.getProfit(sPrice,uPrice,numSold);//assign getProfit method to variable

			System.out.println("\n\tProfit calculation for "+nme);//print statement
			System.out.println("--------------------------------------------------------------------------------------");//print statement
			System.out.println("\nUnit Price\tSales Price\tSales Tax\tNumbers to be Sold\tActual Profit");//print statement
			System.out.println("$"+form.format(uPrice)+"\t\t$"+form.format(sPrice)+"\t\t5%\t\t"+numSold+"\t\t\t$"+form.format(artProfit));//print statement
			System.out.println("\n--------------------------------------------------------------------------------------\n");//print statement

			tProfit+=artProfit;//add variable to another variable

			System.out.print("More to calculate profit? (y for yes, n for No)--> ");//print statement
			l=scan.next();//assign input to variable

			cont=l.charAt(0);//assign first letter to char

		}while(cont=='y');//while loop conditions

		System.out.println("\nTotal Anticipated profits: $"+form.format(tProfit));//print Statement
	}
}