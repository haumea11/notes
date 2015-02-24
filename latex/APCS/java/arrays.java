public class arrays{
	public static void main (String[] args);
	// myArrayList is a reference to a future ArrayList object
	ArrayList names;

	// myArrayList is a reference to an ArrayList object. The
	// Java system picks the initial capacity.
	// myVector is a reference to an ArrayList object with an
	// initial capacity of 15 elements.
	ArrayList names = new ArrayList (6);
	
	names.add("Grace");
	names.add("Erin");
	names.add("Shannon");
	names.add("Ryan");
	names.add("John");

	for (int j = 0; j < names.size(); j++){
	System.out.println( j + ": " + names.get(j)); 
	}
}
