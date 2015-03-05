public class decktester {

	public static void main(String[] args){
		
		String [] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] cardSuit = {"Clubs", "Spades", "Diamonds", "Hearts"};
		int [] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		deck d = new deck(cardRank,cardSuit,cardValue);
		d.shuffle();
		card c = d.deal();
		System.out.println(c.getSuit());
		/*System.out.println(d.isEmpty());
		System.out.println(d.size());
		d.deal();*/
	}
}