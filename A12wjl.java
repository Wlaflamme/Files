import java.util.Scanner;
import java.io.*;
public class A12wjl
{
	public static void main(String[] args)
	{
		String filename;
		String line;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		line = inputFile.nextLine();
