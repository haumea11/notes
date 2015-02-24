/* John Markiewicz
 * Advanced Placement Computer Science
 * 15.02.05
 * Herein lies a converter from feet to meters, useful
 * if your grasp of metric is lacking.
 * 
 * Hope you enjoy.
 */
package conversions;
import chn.util.*;
class footmeter
{
	public double toMeters(double feet){
		return feet * 0.305;
	}
}

public class converter
{
	public static void main(String[] args){
		ConsoleIO in = new ConsoleIO();
		System.out.print("Input the quantity of the measurement of feet which you wish to convert to the measurement of meters: ");
		double feet = in.readDouble();
		footmeter grep = new footmeter();
		System.out.println("Your number of feet has been found to be equivalent to: "+grep.toMeters(feet));
	}
}

// Input the quantity of the measurement of feet which you wish to convert to the measurement of meters: 88.447
// Your number of feet has been found to be equivalent to: 26.976335