/*******************************************
Programmer: Will Laflamme
Date:10/27/17
Output:remove chosen from array list
*******************************************/
import java.util.ArrayList;//import arraylist
import java.util.Scanner;//import scanner
public class A11wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		int i, size, num;//variables
		String m;//string
		char l;//char
		ArrayList<String> list = new ArrayList<String>();//declare array lisst
		Scanner scan=new Scanner(System.in);//create scanner object

		list.add("Name: Andrew Jung\t\tPhone Number: 757-888-8888");//add to arraylist
		list.add("Name: Michael Summers\t\tPhone Number: 757-999-9999");//add to arraylist
		list.add("Name: Whitney Wright\t\tPhone Number: 757-111-1111");//add to arraylist
		list.add("Name: Aleander Jones\t\tPhone Number: 757-222-2222");//add to arraylist
		list.add("Name: Robert Newmaster\t\tPhone Number: 757-333-3333");//add to arraylist
		list.add("Name: Chris Jester\t\tPhone Number: 757-444-4444");//add to arraylist
		list.add("Name: Heather Garn\t\tPhone Number: 757-555-5555");//add to arraylist
		list.add("Name: Jared Cook\t\tPhone Number: 757-666-6666");//add to arraylist
		list.add("Name: Gregry Umfleet\t\tPhone Number: 757-777-7777");//add to arraylist
		list.add("Name: Nicolas\t\t\tPhone Number: 804-221-2121");//add to arraylist

		do//do while loop
		{
			size=list.size();//assign to variable

			for(i=0;i<size;i++)//for loop
			{
				System.out.println("List "+(i+1)+":\n"+list.get(i));//Print statement
				System.out.println();//Print statement
			}

			System.out.print("Do you have any item to delete(y for yes or n for no)--> ");//Print statement
			m=scan.next();//assign input to variable

			l=m.charAt(0);//assign char of string to char

			if(l=='y')//if statement
			{
				System.out.print("Enter List Number to remove: ");//Print statement
				num=scan.nextInt();//assign input to variable

				System.out.println();//Print statement

				num-=1;//subtract one from num

				list.remove(num);//remove from list
			}

		}while(l=='y');//conditions for loop
	}
}
