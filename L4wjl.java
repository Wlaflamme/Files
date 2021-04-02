/*******************************************
Programmer: Will Laflamme
Date:10/4/17
Output:gives to random numbers to add or subtract then checks if user is correct
*******************************************/
import java.util.Scanner;//import scanner
public class L4wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		int i, j, k, suma;//variables
		String l;//string variable
		char select;//letter variable

		Scanner keyboard = new Scanner(System.in);//create scanner object

		randomwjl num = new randomwjl();//create randomwjl object

		i = num.random_num1();//random method run

		j = num.random_num2();//random method run

		System.out.print("Select + or -:  ");//print statement
		l = keyboard.nextLine();//assign input to variable

		select = l.charAt(0);//assign first of l to select

		if(select == '+' )//if statement
		{
			num.plus();// method run
			System.out.print(i + " + " + j + " = " );//print statement
			suma = keyboard.nextInt();//assign input to variable

			num.compare(suma);//method run
		}
		if(select == '-')//if statement
		{
			num.minus();//method run
			System.out.print(i + " - " + j + " = " );//print statement
			suma = keyboard.nextInt();//assign input to variable
			num.compare(suma);//method run
		}
	}
}
