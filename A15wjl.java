/*******************************************
Programmer: Will Laflamme
Date:10/17/17
Output:use try and catch on array
*******************************************/
public class A15wjl//class declaration
{
	public static void main(String[] args)//main method
	{

		int[]grade={90,75,77,92,100,88,65};//new array

		try//try statement
		{
			for(int i=grade.length;i>0;i--)//for loop
			{
				System.out.println("The value of array is "+grade[i]);//print statement
			}
		}
		catch(ArrayIndexOutOfBoundsException e)//catch statement
		{
			System.out.println(e.getMessage());//print default message
		}
	}
}