/*******************************************
Programmer: Will Laflamme
Date:9/8/17
Output:program that determines average grade through user inputs
*******************************************/
import java.util.Scanner;//import scanner
public class A1wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		int total;//int variable
		int grade=0;//int variable
		int counter=0;//int variable
		float average;//float variable
		total=0;//assign value to total

		Scanner scan = new Scanner(System.in);//create scanner object
		while(grade != -1)//while loop
		{
			System.out.print("Enter grade: ");//print statement
			grade = scan.nextInt();//assign input to variable
			if(grade!=-1)//if statement
			{
				total += grade;//assign value to variable
				counter++;//add one to variable
			}
		}
			average = total / counter;//assign value determined through formula to variable
	System.out.println("Class Average: " + average);//print statement
	}
}
