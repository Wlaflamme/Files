/*******************************************
Programmer: Will Laflamme
Date:12/1/17
Output:print rate of interest
*******************************************/
public class bankTest//class declaration
{
	public static void main(String[]args)//main method
	{
		bank b=new bank(8,7,9);
		SBI  s=new SBI();//create object
		ICICI i=new ICICI();//create object
		AXIS  a=new AXIS();//create object

		System.out.println("SBI Rate of interest: "+s.getRateOfInterest()+"%\nICICI Rate of interest: "+i.getRateOfInterest()+"%\nAxis Rate of interest: "+a.getRateOfInterest());//print statement
	}
}