/*
 * Ryan Mar
 * 3/11/2015
 * Pig latin lab
 * converts to pig latin 
 *
 */

import java.util.*;

public class PigLatinLab {
	
	public static boolean isVowell(String input, int position)
	{
		if(input.charAt(position)=='a'||input.charAt(position)=='e'||input.charAt(position)=='i'||input.charAt(position)=='o'||input.charAt(position)=='u')
		{
			return true;
		}
		else if (input.charAt(position)=='A'||input.charAt(position)=='E'||input.charAt(position)=='I'||input.charAt(position)=='O'||input.charAt(position)=='U')
		{
			return true;
		}
		return false;
	}
	
	public static boolean isVowell(char input)
	{
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
		{
			return true;
		}
		else if (input=='A'||input=='E'||input=='I'||input=='O'||input=='U')
		{
			return true;
		}
		return false;
	}
	
	public static int firstVowellAt(String input)
	{
		char letter;
		for(int i=0;i<input.length();i++)
		{
			letter=input.charAt(i);
			if(isVowell(letter)==true)
			{
				return i;
			}
		}
		return 0;
	}
	
	public static boolean containsVowell(String input)
	{
		char letter;
		for(int i=0;i<input.length();i++)
		{
			letter=input.charAt(i);
			if(isVowell(letter)==true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static String toPigLatin(String input)
	{
		String newWord="";
		String wordStart="";
		String wordEnd="";
		
		if(containsVowell(input)==true)
		{
			wordStart=input.substring(0, firstVowellAt(input));
			wordEnd=input.substring(firstVowellAt(input), input.length());
			wordEnd.toLowerCase();
			
			if(isVowell(input, 0)==false)
			{
				newWord=wordEnd+wordStart+"ay";
			}
			else if(isVowell(input, 0)==true)
			{
				newWord=input+"yay";
			}
		}
		
		else
		{
			newWord=input+"ay";
		}
			
		return newWord;
	}
	
	public static String lineToPigLatinNonST(String line)
	{
		String pigLine="";
		
		String lineSubFirst="";
		String lineSubRest=line.substring(0, line.length()-1);
		
		char c;
		int words=0;
		for(int k=0;k<line.length();k++)
		{
			c=line.charAt(k);
			if(c==' ')
			{
				words++;
			}
		}
		
		words++;
		
		//find number of words instead of line.length
		for(int i=0;i<=words;i++)
		{
			lineSubFirst=lineSubRest.substring(0, lineSubRest.indexOf(' '));
			lineSubRest=lineSubRest.substring(lineSubRest.indexOf(' '), lineSubRest.length());
			pigLine=pigLine+toPigLatin(lineSubFirst);
		}
		
		return pigLine;
	}
	
	public static String lineToPigLatin(String input)
	{
		StringTokenizer st=new StringTokenizer(input);
		String pigLine="";
		
		while(st.hasMoreTokens())
		{
			pigLine=pigLine+toPigLatin(st.nextToken())+ " ";
		}
		
		return pigLine;
	}
	
	public static void main(String[] args)
	{
		System.out.println(toPigLatin("BWHS"));
		System.out.println(toPigLatin("Advanced"));
		System.out.println(toPigLatin("Placement"));
		System.out.println(toPigLatin("Computer"));
		System.out.println(toPigLatin("Science"));
		System.out.println(lineToPigLatin("rats live on no evil star"));
		//System.out.println(lineToPigLatinNonST("rats live on no evil star"));
	}

}

/*
 * output
 *BWHSay
 *Advancedyay
 *acementPlay
 *omputerCay
 *ienceScay
 *atsray ivelay onyay onay evilyay arstay
 */
