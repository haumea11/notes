package easter;
import chn.util.*;
public class rabbit {
public static void main(String[] args)
{

	        ConsoleIO input = new ConsoleIO();
	        System.out.print("Input your year: ");
	        int y = input.readInt();
	        int a = y % 19;
	        int b = y / 100;
	        int c = y % 100;
	        int d = b / 4;
	        int e = b % 4;
	        int g = (8 * b + 13) / 25;
	        int h = (19 * a + b - d - g + 15) % 30;
	        int j = c / 4;
	        int k = c % 4;
	        int m = (a + 11 * h) / 319;
	        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
	        int n = (h - m + r + 90) / 25;
	        int p = (h - m + r + n + 19) % 32;

	        int date = p+1;
	        System.out.println("Easter fell on day " + date + " of April in the year " + y);
	        // There would be a rabbit in the code here originally, but this is reprogramming it so as to show 
	        // I'm capable of doing it.
}
}
