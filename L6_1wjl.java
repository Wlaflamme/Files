/*******************************************
Programmer: Will Laflamme
Date:10/8/17
Output:a lotto program that generates random numbers
*******************************************/
import java.util.Scanner;//import scanner
public class L6_1wjl//class declaration
{
	public static void main(String[] args)//main method
	{

		int[]nums=new int[6];//new array


		Scanner scan=new Scanner(System.in);//create scanner object

		Class1wjl lotto=new Class1wjl();//create class1wjl object

		int[]draw=lotto.drawn();//call method to assign value to array

		System.out.println("Welcome to Lucky Money System!!\n");//print statement
		System.out.println("0   1   2   3   4   5   6   7   8   9   10\n11  12  13  14  15  16  17  18  19  20");//print statement
		System.out.println("Winning info.:\n*********************************************");//print Statement
		System.out.println("Five Numbers\tMega Ball\tPrize\n5\t\t1\t\t$12,000,000\n5\t\t0\t\t$250,000\n4\t\t1\t\t$10,000\n4\t\t0\t\t$150\n3\t\t1\t\t$150\n2\t\t1\t\t$10\n3\t\t0\t\t$7\n1\t\t1\t\t$3\n0\t\t1\t\t$2");//print statement
		System.out.println("*********************************************\n");//print statement

		System.out.print("Choose Five Numbers: ");//print statement
		for(int i=0;i<5;i++)//for loop
			nums[i]=scan.nextInt();//assign input to array

		System.out.print("Choose Mega Ball: ");//print statement
		nums[5]=scan.nextInt();//assign input to array

		System.out.println("\nYou Chose Following:");//print statement

		for(int i=0;i<5;i++)//for loop
		System.out.print(nums[i]+" ");//print statement

		System.out.println("Mega Ball - "+nums[5]+"\n");//print statement

		System.out.println("DRAW RESULT:\n"+draw[0]+" "+draw[1]+" "+draw[2]+" "+draw[3]+" "+draw[4]+" Mega Ball - "+draw[5]+"\n");//print statement

		lotto.compare(nums,draw);//call method

	}
}