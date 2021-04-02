/*******************************************
Programmer: Will Laflamme
Date:10/8/17
Output:methods for a lotto program
*******************************************/
import java.util.Random;//import random
public class Class1wjl//class declaration
{



	public static int[] drawn()//method
	{
		int []draw=new int[6];//array

		Random rNum=new Random();//create random object

		for(int i=0;i<draw.length;i++)//for loop
		{
			draw[i]=0+rNum.nextInt(20);//assign random value to variable
		}

		return draw;//return array
	}

	public void compare(int[]a,int[]b)//method
	{
		int match=0;//variable
		for(int i=0;i<5;i++)//for loop
		{
			for(int j=0;j<5;j++)//for loop
			{
				if(a[i]==b[j])//if statement
				{
					System.out.println("Number "+a[i]+" is matched.");//print statement

					match++;//add one
				}
			}
		}

		if(a[5]==b[5])//if statement
		{
			System.out.println("Mega Ball Number is "+a[5]+" matched");//print statement
			match++;//add one
		}

		if(match>0)//if statement
		{
			System.out.println("You are a Winner!");//print statement
		}
		else//else statement
		{
			System.out.println("You are a Looser!");//print statement
		}
	}
}