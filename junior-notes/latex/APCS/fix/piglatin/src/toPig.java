/*
 * John Markiewicz
 * 14.03.24
 * The Piglatin lab
 * 
 * Here it is.
 * 
 * The most influential program
 * *of all time*
 * right here, right now.  A pig
 * latin conversion utility.  
 * Get excited.
 * 
 * Never got stringTokenizing to work.  
 * Feel free to take off points for that.
 */
import java.util.StringTokenizer;

public class toPig{
        public static String to_pig(String in){
                // If the word begins with a consonant, move the consonant to the
                // end of the word.
                //
                // If the word begins with a vowel, add -"ay" to it.
        	 
                if(in.charAt(0) == 'a' || in.charAt(0) == 'e' || in.charAt(0) == 'i' || in.charAt(0) == 'o'
                                || in.charAt(0) == 'u'){
                        return(in+"ay");
                }
                // substring.  Use substring.
                else if(!(in.charAt(0) == 'a' || in.charAt(0) == 'e' || in.charAt(0) == 'i' || in.charAt(0) == 'o'
                        || in.charAt(0) == 'u') && !(in.charAt(1) == 'a' || in.charAt(1) == 'e' || in.charAt(1) == 'i' || in.charAt(1) == 'o'
                        || in.charAt(1) == 'u') &&!(in.charAt(2) == 'a' || in.charAt(2) == 'e' || in.charAt(2) == 'i' || in.charAt(2) == 'o'
                                || in.charAt(2) == 'u') ) {
                	return(in.substring(3,(in.length()))+in.charAt(0)+in.charAt(1)+in.charAt(2)+"ay");
                }
                    
                else if(!(in.charAt(0) == 'a' || in.charAt(0) == 'e' || in.charAt(0) == 'i' || in.charAt(0) == 'o'
                        || in.charAt(0) == 'u') && !(in.charAt(1) == 'a' || in.charAt(1) == 'e' || in.charAt(1) == 'i' || in.charAt(0) == 'o'
                        || in.charAt(0) == '1')){
                	return(in.substring(2,(in.length()))+in.charAt(0)+in.charAt(1)+"ay");
                }
                
                 else{
                        return(in.substring(1,(in.length()))+in.charAt(0)+"ay");
                }
        }

        public static void main(String[] args){
               System.out.println( to_pig("apple"));
               System.out.println(to_pig("pear"));
               System.out.println(to_pig("prear"));
               System.out.println(to_pig("Xylophone"));
        }
}
/*
Output:
appleay
earpay
earpray
ophoneXylay
	*/