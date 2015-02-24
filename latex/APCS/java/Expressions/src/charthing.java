import chn.util.*;
public class charthing {
	public static void main(String[] args)
	{
		String c; //character in each row
		int f = 0; // length of the row
		ConsoleIO e = new ConsoleIO();
		System.out.print("Insert the character: ");
		c = e.readToken();
		System.out.print("Insert the number of rows: ");
		f = e.readInt();
		for(int a = 0; a<= f; a++)
		{
			for(int b = 0; (b)<=(f-1); b++)
			{
				if((f-(b/2))<a)
					System.out.print(c);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
