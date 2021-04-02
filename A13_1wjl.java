/*******************************************
Programmer: Will Laflamme
Date:10/15/17
Output:methods for A13wjl
*******************************************/
import java.util.Scanner;//import scanner
public class A13_1wjl//class declaration
{
	public void sortAscending(double[]array)//method
	{
		int startScan, index, minIndex;//variables
		double minValue,find;//variable

		Scanner scan = new Scanner(System.in);//create scanner object

		for (startScan = 0; startScan < (array.length-1); startScan++)//for loop
		{
			minIndex = startScan;//assign value
		    minValue = array[startScan];//assign value
		    for(index = startScan + 1; index < array.length; index++)//for loop
		    {
				if (array[index] < minValue)//if statement
		        {
					minValue = array[index];//assign value
		            minIndex = index;//assign value
		        }
		    }
		    array[minIndex] = array[startScan];//assign value
		    array[startScan] = minValue;//assign value
		}
		for(int i=0;i<array.length;i++)//for loop
		System.out.print(array[i]+" ");//print statement

		int lgth=(array.length-1);//assign value

		System.out.print("\nEnter the number you are looking for: ");//print statement
		find=scan.nextDouble();//assign value to variable

		this.searchNum(array,find,0,lgth);
	}

	public void searchNum(double[]a,double key, int low,int high)//method
	{
		int middle;//variable

		do//do loop
		{
			middle=(low+high)/2;//assign value to variable

			if(key==a[middle])//if statement
			System.out.print(key+" is found in the array at element "+middle+"\n");//print statement

			else if(key<a[middle])//else if statement
			high=middle-1;//assign value

			else//else statement
			low=middle+1;//assign value
		}while(key!=a[middle]);//while condition
	}
}