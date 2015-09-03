import chn.util.*;
public class number 
{
	
	public static void main(String[] args)
	{
		int a;
		ConsoleIO b = new ConsoleIO();
		System.out.println("Enter Choice: ");
		a = b.readInt();
		String translate;
		switch (a){
		case 1: translate = "yī";
		break;
		case 2: translate = "èr";
		break;
		case 3: translate = "sān";
		break;
		case 4: translate = "sì";
		break;
		case 5: translate = "wǔ";
		break;
		default: translate = "no";
		break;
		}
		System.out.println(translate);
		/*
		Enter Choice: 
		3
		sān
		*/
					
	}
}
