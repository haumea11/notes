/* John Markiewicz
 * Advanced Placement Comp. Sci.
 * For Ms. Anthony
 * The lab assigned on Friday.
 * 
 * Comments: This lab seemed almost redundant to me.  I guess we had to have some work
 * to deal with while you were away, but the fact that there are basically 3 of the same 
 * problem feels like a bit much.
 * 
 * Hope you enjoy my code.
 */

package la71fun;
class temperator{
	public double fToC(double f){
		return (f - 32) * (5 / 9);
	}
	public double cToF(double c){
		return (9/5) * c + 32;
	}
}

class spherator{
	public double toSphere(double r){
		return (4/3)*3.14*r*r*r;
	}
}

class hypotenator{
	public double toHyp(double a, double b){
		return Math.sqrt(a*a+b*b);
	}
}

public class funlab{
	public static void main (String[] args){
		temperator a = new temperator();
		System.out.println("The Answers are as follows:");
		System.out.println(a.fToC(212)+"   "+a.fToC(98.6)+"   "+a.fToC(10));
		System.out.println(a.cToF(-15)+"   "+a.cToF(0)+"   "+a.cToF(70));
		System.out.println();
		
		spherator b = new spherator();
		System.out.println(b.toSphere(1)+"   "+b.toSphere(2.25)+"   "+b.toSphere(7.5));
		System.out.println();
		
		hypotenator c = new hypotenator();
		System.out.println(c.toHyp(3, 4)+"   "+c.toHyp(6.75, 12.31));
	}
}

/*
The Answers are as follows:
0.0   0.0   -0.0
17.0   32.0   102.0

3.14   35.7665625   1324.6875

5.0   14.039180887786866

Couldn't get the Format.left() method to work.
*/