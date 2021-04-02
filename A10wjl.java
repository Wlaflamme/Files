/*******************************************
Programmer: Will Laflamme
Date:10/25/17
Output:class averages from the array
*******************************************/
import java.util.Scanner;//import scanner
import java.text.DecimalFormat;//import format
public class A10wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		int i,j;//variables
		double ave;//variable
		double sum=0;//variable

		Scanner scan=new Scanner(System.in);//create scanner object
		DecimalFormat form=new DecimalFormat("##0.00");//create format object


		double[][] classes = new double[5][];//new array
		classes[0] = new double[10];//array length
		classes[1] = new double[2];//array length
		classes[2] = new double[6];//array length
		classes[3] = new double[5];//array length
		classes[4] = new double[2];//array length

		classes[0][0]=100;//array value
		classes[0][1]=85.5;//array value
		classes[0][2]=25.4;//array value
		classes[0][3]=30.3;//array value
		classes[0][4]=75.5;//array value
		classes[0][5]=100;//array value
		classes[0][6]=88.7;//array value
		classes[0][7]=95.6;//array value
		classes[0][8]=97.8;//array value
		classes[0][9]=55.8;//array value
		classes[1][0]=50;//array value
		classes[1][1]=60;//array value
		classes[2][0]=70.5;//array value
		classes[2][1]=90;//array value
		classes[2][2]=99.9;//array value
		classes[2][3]=65;//array value
		classes[2][4]=44.5;//array value
		classes[2][5]=82.3;//array value
		classes[3][0]=39.5;//array value
		classes[3][1]=68.4;//array value
		classes[3][2]=96.9;//array value
		classes[3][3]=100;//array value
		classes[3][4]=28.7;//array value
		classes[4][0]=55.9;//array value
		classes[4][1]=100;//array value

		for(i=0;i<classes.length;i++)//for loop
		{
			for(j=0;j<classes[i].length;j++)//for loop
			{
				sum+=classes[i][j];//add to variable
			}
			ave=sum/classes[i].length;//find average
			System.out.println("Average of class "+(i+1)+": "+form.format(ave));//print statement
			sum=0;//set variable to zero
		}

	}
}