/*******************************************
Programmer: Will Laflamme
Date:9/22/17
Output:calculates averages using numbers stored in a two dimensional-array
*******************************************/
import java.text.DecimalFormat;//import format
public class A4wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		double total1=0;//double variable
		double total2=0;//double variable
		double total3=0;//double variable
		double average1;//double variable
		double average2;//double variable
		double average3;//double variable
		int count1=0;//int variable
		int count2=0;//int variable
		int count3=0;//int variable

		DecimalFormat form=new DecimalFormat("##0.00");//create format object


		double[][]a={{80.5,100,75,82.3,35.9,73.6,88.9,46.2,100,97.8},{25.5,92.5,65.5,79.6,22.7,66.2,98.7,62.3,100,99.5}};//array

		for(int i=0;i<1;i++)//for loop
		{
			for(int j=0;j<10;j++)//for loop
			{
				total1+=a[0][j];//add to variable
				count1++;//add one
			}



			for(int k=0;k<10;k++)//for loop
			{
				total2+=a[1][k];//add to variable
				count2++;//add one
			}
		}

		average1=total1/count1;//assign value

		average2=total2/count2;//assign value

		total3=total1+total2;//assign value

		count3=count1+count2;//assign value

		average3=total3/count3;//assign value

		System.out.println("Class Average: "+form.format(average3));//print statement
		System.out.println("Math Average: "+form.format(average1));//print statement
		System.out.println("Science Average: "+form.format(average2));//print statement


	}
}