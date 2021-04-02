/*******************************************
Programmer: Will Laflamme
Date:10/17/17
Output:use try and catch on array
*******************************************/
import java.util.Scanner;//import scanner
public class laflamme_lab6//class declaration
{
	public static void main(String[] args)//main method
	{
		String name;//string variable
		int i1,i2;//int variables


		Scanner scan=new Scanner(System.in);//create scanner object

		System.out.print("Enter your full name: ");//print statement
		name=scan.nextLine();//assign input to variable

		String[] nme=name.split("\\s+");//split

		String fName=nme[0];//first name
		String lName=nme[1];//last name

		System.out.println("\n"+name);//print statement

		System.out.print("Enter the beginning and ending index number of your lastname: ");//print statement
		i1=scan.nextInt();//assign input
		i2=scan.nextInt();//assign input

		try//try statement
		{
			lName.compareTo(name.substring(i1,i2));//compare strings
		}
		catch(StringIndexOutOfBoundsException e)//catch statement
		{
			System.out.println(e.getMessage());//print statement
		}
	}
}