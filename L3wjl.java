/*******************************************
Programmer: Will Laflamme
Date:9/27/17
Output:mileage between two cities
*******************************************/
import java.util.Scanner;//import scanner
public class L3wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		int city1=0,city2=0;//variable

		int[][] miles={{0,97,90,268,262,130},{97,0,74,337,144,128},{90,74,0,354,174,201},{268,337,354,0,475,269},{262,144,174,475,0,238},{130,128,201,269,238,0}};//declaring array values

		Scanner scan =new Scanner(System.in);//creating scanner object

		while(city1!=-1||city2!=-1)//while loop
		{
			System.out.println("To determine the mileage between two cities, please enter the numbers of 2 cities from this menu: 0 for Daytona Beach, 1 for Gainesville, 2 for Jacksonville, 3 for Maimi, 4 for Tallahassee, 5 for Tampa(input either city to -1 to end) --->");//print statement
			city1=scan.nextInt();//assign input to variable
			city2=scan.nextInt();//assign input to variable

			if(city1!=-1||city2!=-1)//if statement
			{
				if(city1<=5&&city2<=5)//if statement
				{
					if(city1>=0&&city2>=0)//if statement
					System.out.println("The mileage beatween "+city1+" and "+city2+" is "+miles[city1][city2]+"miles");//print statement

					else//else statement
					System.out.println("Incorrect Input! Please choose correct city number!!");//print statement
				}
				else//else statement
				{
					System.out.println("Incorrect Input! Please choose correct city number!!");//print statement
				}
			}
		}
	}
}