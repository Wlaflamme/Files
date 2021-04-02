/*******************************************
Programmer: Will Laflamme
Date:10/22/17
Output:use inheritence to print input info
*******************************************/
import java.util.Scanner;//import scanner
public class A16_1wjl//class declaration
{
   public static void main (String[] args)//main method
   {
	   String name,id,dep;

	   Scanner scan=new Scanner(System.in);//create scanner object

	   System.out.print("Enter faculty name: ");//print Statement
	   name=scan.next();//assign input
	   System.out.print("Enter faculty ID: ");//print Statement
	   id=scan.next();//assign input
	   System.out.print("Enter faculty Department: ");//print Statement
	   dep=scan.next();//assign input

	   department d=new department(name,id,dep);//create department object
	   faculty f=new faculty(name,id);//create faculty object

	   System.out.println("");//print statement

	   f.facInfo();//call method
	   d.depInfo();//call method

   }
}
