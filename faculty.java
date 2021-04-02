/*******************************************
Programmer: Will Laflamme
Date:10/22/17
Output:super class
*******************************************/
public class faculty
{
	private String name,Id;//variables

	public faculty(String nme,String id)//constructor
	{
		 name=nme;//assign value
		 Id=id;//assign value
	}

	public void facInfo()
	{
		System.out.println("Faculty Name: "+name);//print statement
		System.out.println("Faculty ID: "+Id);//print statement
	}
}