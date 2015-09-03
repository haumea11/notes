import chn.util.*;
public class gradesystem
{
	public static void main(String[] args)
	{
		float a;
		ConsoleIO b = new ConsoleIO();
		a = b;
		/*
		if(a >= 89.5)
			System.out.println("A");
		else
		if(a >= 79.5)
			System.out.println("B");
		else
		if(a >= 69.5)
			System.out.println("C");
		else
		if(a >= 64.5)
			System.out.println("D");
		else
			System.out.println("F");
		*/
		if(a >= 64.5)
			if(a >= 69.5)
				if(a >= 79.5)
					if(a >= 89.5)
						System.out.println("A");
					else
						System.out.println("B");
				else
					System.out.println("C");
			else
				System.out.println("D");
		else
			System.out.println("F");
	}
}
// input: 20
// F