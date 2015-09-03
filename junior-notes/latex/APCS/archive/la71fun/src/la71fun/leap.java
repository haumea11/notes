package la71fun;

public class leap {
	public static Boolean isLeap(int y){
	    if(y%4 == 0)
	    	if(y%100 == 0)
	    		if(y%400 == 0)
	    			return true;
	            else
	            	return false;
	        else
	        	return true;
	    else
	    	return false;
	}

	public static void main (String[] args){
	    Boolean x = isLeap(1600);
	    Boolean y = isLeap(1700);
	    System.out.print("1600: "+x+" and 1700: "+y);
	}

}

//output: "1600: true and 1700: false"
