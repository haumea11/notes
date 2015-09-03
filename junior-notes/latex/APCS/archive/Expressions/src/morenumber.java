import chn.util.*;
public class morenumber 
{
	public static void main(String[] args)
	{
		String sentence;
		int c;
		ConsoleIO b = new ConsoleIO();
		System.out.println("Languages are as follows: 1. Latin  2. Spanish  3. Pig Latin  4. German  5. Klingon  6. Mandarin Chinese");
		System.out.println("Insert your number: ");
		c = b.readInt();
		switch(c)
		{
		case 1:
		{
		System.out.println("Your number will now be translated.");
		System.out.println("Insert your number: ");
		int a = b.readInt();
		switch(a)
		{
		case 1: sentence="1 is \"Unus\" (I) in Latin";
		break;
	
		case 2: sentence="2 is \"Duo\" (II) in Latin";
		break;
	
		case 3: sentence="3 is \"Tres\" (III) in Latin";
		break;
	
		case 4: sentence="4 is \"Quattuor\" (IV) in Latin";
		break;
	
		case 5: sentence="5 is \"Quinque\" (V) in Latin";
		break;	
		}
		break;
		}
		
		case 2:
		{
		System.out.println("Your number will now be translated.");
		System.out.println("Insert your number: ");
		int a = b.readInt();
		
		switch (a)
        {
            case 1:  System.out.println("uno");
                     break;
            case 2:  System.out.println("dos");
                     break;
            case 3:  System.out.println("tres");
                     break;
            case 4:  System.out.println("cuatro");
                     break;
            case 5:  System.out.println("cinco");
                     break;
            default:
            		 System.out.println("Look it up online!!");
            		 break;
        }
		break;
		}
		
		case 3:
		{
			System.out.println("Your number will now be translated.");
			System.out.println("Insert your number: ");
			int a = b.readInt();
			
		switch (a)
		{
		case 1:
			System.out.println("one");
			System.out.println("oneyay");
			break;
		case 2:
			System.out.println("two");
			System.out.println("otway");
			break;
		case 3:
			System.out.println("three");
			System.out.println("eethray");
			break;
		case 4:
			System.out.println("four");
			System.out.println("ourfay");
			break;
		case 5:
			System.out.println("five");
			System.out.println("ivefay");
			break;
		default:
			System.out.println("I only know one through five");
			break;
		}
		break;
		}
		
		case 4:
		{
			System.out.println("Your number will now be translated.");
			System.out.println("Insert your number: ");
			int a = b.readInt();
			
		switch (a)
	        {
	            case 1:  
	            	System.out.println("eins");
	                     break; 
	            case 2:  
	            	System.out.println("zwei");
	                     break;   
	            case 3:  
	            	System.out.println("drei");
	                     break;		                     
	            case 4:  
	            	System.out.println("vier");
	                     break;  
	            case 5:  
	            	System.out.println("funf");
	                     break;
	            default:
	            		 System.out.println("Grab a german dictionary!");
	            		 break;
	
	        }
		break;
		}

		case 5:
		{
			System.out.println("Your number will now be translated.");
			System.out.println("Insert your number: ");
			int a = b.readInt();
			
			switch (a)
			{
			case 0:	System.out.println("pagh");
			break;
			case 1: System.out.println("wa’");
			break;
			case 2: System.out.println("cha’");
			break;
			case 3: System.out.println("wej");
			break;
			case 4: System.out.println("loS");
			break;
			case 5: System.out.println("vagh");
			break;
			case 6: System.out.println("jav");
			break;
			case 7: System.out.println("Soch");
			break;
			case 8: System.out.println("chorgh");
			break;
			case 9: System.out.println("Hut");
			break;
			case 10: System.out.println("wa’maH");
			break;
			}
			break;
		
	}

		case 6:
		{
			System.out.println("Your number will now be translated.");
			System.out.println("Insert your number: ");
			int a = b.readInt();
			
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
		}}
			
		}
	}

/*
Languages are as follows: 1. Latin  2. Spanish  3. Pig Latin  4. German  5. Klingon  6. Mandarin Chinese
Insert your number: 
6
Your number will now be translated.
Insert your number:
2
èr
*/
