public class card{
	string suit();
	string rank();
	int value();
	
	public String getSuit(card){
		System.out.println(card.suit);
	}

	public String getRank(card){
		System.out.println(card.rank);
	}

	public String getValue(card){
		System.out.println(card.value);
	}
	
	public String getCard(card){
		System.out.println("This is a "+card.rank+" of "+card.suit+" worth exactly "+value+" points.");
	}
}
