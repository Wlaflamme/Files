import java.util.Scanner;
public class letterCount
{
      public static void main(String[] args)
      {
            int NUMCHARS = 26, letter, ch;
            char current;
             int other = 0;
             String line;
             Scanner keyboard = new Scanner(System.in);
             int[] upper = new int[NUMCHARS];
             int[] lower = new int[NUMCHARS];
             System.out.println("Enter a senstence: ");
             line = keyboard.nextLine();
             for(ch = 0; ch < line.length(); ch++)
             {
	current = line.charAt(ch);
	if(current >= 'A' && current <= 'Z')
	      upper[current - 'A']++;
	else if(current >= 'a' && current <= 'z')
	       lower[current - 'a']++;
	else
	        other++;
              }
System.out.println();
     for(letter = 0; letter < upper.length; letter++)
     {
          System.out.print((char) (letter + 'A'));
          System.out.print(": " + upper[letter]);
          System.out.print("\t\t" + (char) (letter + 'a'));
          System.out.println(": " + lower[letter]);
      }
      System.out.println();
      System.out.println("Non-alphabetic cahracters: " + other);
   }
}
