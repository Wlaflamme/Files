/*******************************************
Programmer: Will Laflamme
Date:10/25/17
Output:depending on user input do math
*******************************************/
import java.util.Scanner;//import scanner
public class laflamme_act5//class declaration
{
	Scanner scan=new Scanner(System.in);//create method

	public laflamme_act5()//constructor
	{
		int num1=0;//int
		int num2=0;//int
		int ans=0;//int
		String opp="";//string
	}

	public void calAdd(int n,int m)//method
	{
		int ans=n+m;//int

		System.out.println("The result of the calculation is "+ans);//print statement
	}

	public void calSub(int n,int m)//method
	{
		int ans=n-m;//int

		System.out.println("The result of the calculation is "+ans);//print statement
	}

	public void calProduct(int n,int m)//method
	{
		int ans=n*m;//int

		System.out.println("The result of the calculation is "+ans);//print statement
	}

	public void distribute(int num1,int num2,String opp)//method
	{
		System.out.print("Which one you want?\nA: add\nS:subtract\nM: multiplication -->");//print Statement
		opp=scan.next();//assign input

		char l=opp.charAt(0);//assign character

		if(l=='A')//if statement
		{
			this.calAdd(num1,num2);//call method
		}

		else if(l=='S')//else if
		{
			this.calSub(num1,num2);//call method
		}

		else if(l=='M')//else if
		{
			this.calProduct(num1,num2);//call method
		}
	}

	public void getAsk()//method
	{
		System.out.print("Enter first number: ");//print Statement
		int num1=scan.nextInt();//assign input

		System.out.print("Enter second number: ");//print Statement
		int num2=scan.nextInt();//assign input

		String opp="";//string
		this.distribute(num1,num2,opp);//call method
	}
}