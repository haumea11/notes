public bool isLeap(int y){
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
    bool x = isLeap(2000);
    System.out.print(x);
}
