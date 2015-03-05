import chn.util.*;
public class tables {
	public static void main(String[] args)
	{
		int c = 0;
		int d = 0;
		ConsoleIO e = new ConsoleIO();
		System.out.print("Insert the first number (rows):");
		c = e.readInt();
		System.out.print("Insert the second number (columns):");
		d = e.readInt();
		
		
		for(int a=1; a<=c; a++)
		{
			for(int b=1; b<=d; b++)
				System.out.print(a*b+"  ");
			System.out.println();
		}
	}
}

/*
 * Thusly follows, the output of the code.
Insert the first number (rows):2
Insert the second number (columns):9
1  2  3  4  5  6  7  8  9  
2  4  6  8  10  12  14  16  18  
*/
