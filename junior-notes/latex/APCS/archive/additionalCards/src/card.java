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
	
	
	// Begrudgingly, I must use the recommended capitals.

	 
	public int CompareCards(card a, card b){
		if(a.getValue()<b.getValue())
			return 1;
		if(a.getValue()>b.getValue())
			return 2;
		else
			return 0;
		}
	/*
	public String getCard(){
		System.out.println("This is a "+card.rank+" of "+card.suit+" worth exactly "+value+" points.");
	}*/
}

