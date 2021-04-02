/*******************************************
Programmer: Will Laflamme
Date:10/22/17
Output:sub class
*******************************************/
public class department extends faculty//class declaration
{
	private String dep;//variable

	public department(String nme,String id,String dp)//constructor
	{
		super(nme,id);//parameters for super
		dep=dp;//variable
	}

	public void depInfo()//method
	{
		System.out.println("Department: "+dep);//print statement
	}
}