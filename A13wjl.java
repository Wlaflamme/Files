/*******************************************
Programmer: Will Laflamme
Date:10/15/17
Output:input numbers into an array that sorts them then tells you where the number you're looking for is
*******************************************/
import java.util.Scanner;//import scanner
public class A13wjl//class declaration
{
	public static void main(String[] args)//main method
	{

		int lgth;//variable
		double find;//variable

		Scanner scan = new Scanner(System.in);//create scanner object
		A13_1wjl blub=new A13_1wjl();//create object

		System.out.print("How many numbers do you want to input? ");//print statement
		lgth=scan.nextInt();//assign input to variable

		double[]nums=new double[lgth];//create double array

		for(int i=0;i<nums.length;i++)//for loop
		{
			System.out.print("Input number "+(i+1)+": ");//print statement
			nums[i]=scan.nextDouble();//assign input to array
		}

		for(int i=0;i<nums.length;i++)//for loop
		{
			System.out.print(nums[i]+" ");//print statement
		}

		System.out.println("\nSorted numbers are:");//print statement

		blub.sortAscending(nums);//call method
	}
}