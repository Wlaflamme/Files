/*******************************************
Programmer: Will Laflamme
Date:10/4/17
Output:gives to random numbers to add or subtract then checks if user is correct
*******************************************/
import java.util.Scanner;//import scanner
public class A7wjl//class declaration
{
	public static void main(String[] args)//main method
	{
		int choice;
		double radius,length,width,base,height;

		Scanner scan = new Scanner(System.in);

		geometry geo=new geometry();

		System.out.print("1. Calculate the area of a Circle\n2. Calculate the area of a Rectangle\n3. Calculate the area of a Triangle\n4. QUIT\nEnter your choice(1-4): ");//print statement
		choice=scan.nextInt();

		if(choice==1)
		{
			System.out.print("Enter the radius of the circle: ");
			radius=scan.nextDouble();
			if(radius>0)
				System.out.println("The area of the circle is "+geo.circArea(radius));

			else
				System.out.println("ERROR radius is negative");
		}

		else if(choice==2)
		{
			System.out.print("Enter the length of the rectangle: ");
			length=scan.nextDouble();
			System.out.print("Enter the width of the rectangle: ");
			width=scan.nextDouble();
			if(length>0&&width>0)
				System.out.println("The area of the rectangle is "+geo.rectArea(length,width));

			else
				System.out.println("ERROR the length or width is negative");
		}

		else if(choice==3)
		{
			System.out.print("Enter the base of the triangle: ");
			base=scan.nextDouble();
			System.out.print("Enter the height of the triangle: ");
			height=scan.nextDouble();
			if(base>0&&height>0)
				System.out.println("The area of the triangle is "+geo.triArea(base,height));

			else
				System.out.println("ERROR the base or height is negative");
		}

		else if(choice==4)
		{
			System.out.println("you quit");
		}

		else
		{
			System.out.println("ERROR");
		}
	}
}
