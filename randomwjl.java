/*******************************************
Programmer: Will Laflamme
Date:10/4/17
Output:methods for the main method
*******************************************/
import java.util.Random;//import random
public class randomwjl//class declaration
{
	private int i;//private variable
	private int j;//private variable
	private int sum1;//private variable
	private int sum2;//private variable

	Random rNum=new Random();//create random object

	public int random_num1()//method
	{
		i=0+rNum.nextInt(9);//assign random value to variable

		return i;//return i
	}

	public int random_num2()//method
	{
		j=0+rNum.nextInt(9);//assign random value to variable

		return j;//return
	}

	public int plus()//method
	{
		sum1=i+j;//value to variable

		return sum1;//return
	}

	public int minus()//method
	{
		sum2=i-j;//value to variable

		return sum2;//return
	}

	public void compare(int suma)//method
	{
		if(suma==sum1||suma==sum2)//if statement
		System.out.println("Correct!");//print statement

		else//else statement
		System.out.println("Incorrect!");//print statement
	}
}
