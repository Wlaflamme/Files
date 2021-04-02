/*******************************************
Programmer: Will Laflamme
Date:9/20/17
Output:
*******************************************/
import java.util.Scanner;//import scanner
import java.text.DecimalFormat;
public class L2wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		double pay,gross;//double variables
		double sale=0;//double variables
		double week=200.00;//double variables
		int size=9;//int variable
		int i=0;//int variable

		Scanner scan=new Scanner(System.in);//create scanner object
		DecimalFormat formatter=new DecimalFormat("##0.00");//create format object

		double salary[]=new double[i];//new array
		int place[]=new int[size];//new array

		while(sale!=-1)//while loop
		{
			System.out.print("Enter Sales(-1 to end):\n$");//print statement
			sale=scan.nextDouble();//assign input to variable
			if(sale!=-1)//if statement
			{
				gross=sale*0.09;//assign variable value
				pay=week+gross;//assign variable value

				System.out.println("Total Salary: $"+formatter.format(pay));//print statement

				salary[i]=pay;//assign value to array
				i++;//add one to variable
			}
		}

		for(i=0;i<salary.length;i++)//for loop
		{
			if(salary[i] >= 200 && salary[i] <= 299)//if loop
	      	place[0]++;//add one to array

	      	else if(salary[i] >= 300 && salary[i] <= 399)//else if statement
	      	place[1]++;//add one to array

	      	else if(salary[i] >= 400 && salary[i] <= 499)//else if statement
	      	place[2]++;//add one to array

	      	else if(salary[i] >= 500 && salary[i] <= 599)//else if statement
	      	place[3]++;//add one to array

	      	else if(salary[i] >= 600 && salary[i] <= 699)//else if statement
	      	place[4]++;//add one to array

	      	else if(salary[i] >= 700 && salary[i] <= 799)//else if statement
	      	place[5]++;//add one to array

	      	else if(salary[i] >= 800 && salary[i] <= 899)//else if statement
	      	place[6]++;//add one to array

	      	else if(salary[i] >= 900 && salary[i] <= 999)//else if statement
	      	place[7]++;//add one to array

	      	else if(salary[i]>=1000)//else if statement
	      	place[8]++;//add one to array
		}

		System.out.println("Salary Range:  Total:");//print statement

		int a=200;//int variable
		int b=299;//int variable

		for(i=0;i<place.length;i++);//for loop
		{
			if(a!=1000)//if statement
			{
				System.out.println("$"+a+"-"+b+"\t"+place[i]);//print statement
				a=a+100;//add 100 to variable
				b=b+100;//add 100 to variable
			}
			System.out.println("$1000+  \t"+place[i]);//print statement
		}
	}
}