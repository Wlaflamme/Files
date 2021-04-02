/*******************************************
Programmer: Will Laflamme
Date:9/13/17
Output:Store all even values from 0 to 20 into an array then pritn them
*******************************************/
import java.util.Scanner;//import scanner
public class A3wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		int i;//variable
		int total=0;//variable

		Scanner scan=new Scanner(System.in);//create scanner object

		int[]num=new int[11];//create array

		for(i=0;i<num.length;i++)//for loop
		{
			num[i]=(i*2);//assign value to array
			total+=(i*2);//add value to variable
		}

		System.out.print("Element #\t\t");//print statement
		System.out.println("Value");//print statement

		for(i=0;i<num.length;i++)//for loop
		{
			System.out.print(i+"\t\t\t");//print statement
			System.out.print((num[i])+"\n");//print statement
		}

		System.out.println("\nSum of all even numbers from 0 to 20: "+total);//print statement
	}

}
