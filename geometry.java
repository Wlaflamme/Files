/*******************************************
Programmer: Will Laflamme
Date:10/4/17
Output:gives to random numbers to add or subtract then checks if user is correct
*******************************************/
import java.util.Scanner;//import scanner
public class geometry//class declaration
{

	public static double circArea(double rad)
	{
		return Math.PI*(rad*rad);
	}

	public static double rectArea(double len,double wid)
	{
		return len*wid;
	}

	public static double triArea(double base,double hght)
	{
		return base*hght*.5;
	}
}