/*******************************************
Programmer: Will Laflamme
Date:9/27/17
Output:replace all use of the word love with the word hate
*******************************************/
public class A5wjl//class declaration
{
	public static void main(String[]args)//main method
	{
		String poem="I love your dark eyes, And your curly hair, I love your smile, And the way that you care. I love your deep kisses, I love your soft touch, I love you, I love you, I love you so much.";//string variable

		String hate=poem.replace("love","hate");//string variable

		System.out.println(hate);//print statement
	}
}