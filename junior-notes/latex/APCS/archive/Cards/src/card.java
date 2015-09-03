public class card{
	private String mySuit;
	private String myRank;
	private int myValue;
	
	public card(String rank, String suit, int value) {
		myRank = rank;
		mySuit = suit;
		myValue = value;
	}
	
	public String getSuit(){
		return mySuit;
	}

	public String getRank() {
		return myRank;
	}

	public int getValue() {
		return myValue;
	}
	/*
	public String getCard(){
		System.out.println("This is a "+card.rank+" of "+card.suit+" worth exactly "+value+" points.");
	}*/
}
