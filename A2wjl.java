/*******************************************
Programmer: Will Laflamme
Date:9/6/17
Output:the multiplication of all even numbers from 1-10
*******************************************/
public class A2wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		int total=1;//creating a int variable
		for(int i=1;i<=10;i++)//for loop
		{
			i++;//add one to i

			total=total*i;//total equals total times i

			if(i==10)//if statement
			{
				System.out.println("2 x 4 x 6 x 8 x 10 = "+ total);//print statement
			}
		}
	}
}
