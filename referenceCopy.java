public class referenceCopy
{
	public static void main(String[]args)
	{
		int[] array1={2,4,6,8,10};
		int[]array2=array1;

		array1[0]=200;

		array2[4]=1000;

		System.out.println("The contents of array1:");

		for(int val:array1)
		System.out.print(val+" ");

		System.out.println();

		System.out.println("The contents of array2:");

		for(int val:array2)
		System.out.print(val+" ");

		System.out.println();
	}
}