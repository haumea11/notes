public class toPig{
	public static String to_pig(String in){
		// If the word begins with a consonant, move the consonant to the
		// end of the word.
		// 
		// If the word begins with aa vowel, add -"ay" to it.
		if(in.charAt(0) == 'a' || in.charAt(0) == 'e' || in.charAt(0) == 'i' || in.charAt(0) == 'o' 
				|| in.charAt(0) == 'u'){
			return(in+"ay");
		}	
		// substring.  Use substring.
		else{
			return(in.substring(1, (in.charAt(in.length()-1)))+in.charAt(0)+"ay");
		}
	}

	public static void main(String[] args){
		to_pig("apple");
	}
}
