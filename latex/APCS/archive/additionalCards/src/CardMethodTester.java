public class CardMethodTester {

public static void main(String[] args){
		
		String [] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] cardSuit = {"Clubs", "Spades", "Diamonds", "Hearts"};
		int [] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		deck d = new deck(cardRank,cardSuit,cardValue);
		d.shuffle();
		d.deal();
		d.deal();
		d.shuffle();
		card c = d.deal();
		d.shuffle();
		card e = d.deal();
		c.CompareCards(c, e);
		if(c.CompareCards(c, e) == 0){
			System.out.println("The "+c.getRank()+" of "+c.getSuit()+" is equal to the "+e.getRank()+" of "+e.getSuit());
		}
		else if(c.CompareCards(c, e) == 1){
			System.out.println("The "+c.getRank()+" of "+c.getSuit()+" is less than the "+e.getRank()+" of "+e.getSuit());
		}
		else {
			System.out.println("The "+c.getRank()+" of "+c.getSuit()+" is greater than the "+e.getRank()+" of "+e.getSuit());
		}
		// System.out.println(c.getSuit());
		/* System.out.println(d.isEmpty());
		 * System.out.println(d.size());
		 * d.deal();
		 */
}
}
