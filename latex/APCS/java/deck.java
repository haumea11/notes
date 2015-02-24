import java.util.list;
import java.util.arraylist;

public class deck{
	// cards contains all cards in the deck.
	private List<card> cards;
	
	// size is all not dealt cards
	private int size;
	
	// creates a deck with the ranks "ranks", suits "suits", values "values".  This class is a constructor for the deck class, which contains the cards.  This is the basis for decktester.
	public Deck(String[] ranks, String[] suits, int[] values){
		cards = new ArrayList<Card>();
		for (int j=0, j<ranks, j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
	size = cards.size(); // arraylists have size, arrays have length.
	shuffle();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void shuffle() {
	// to be written
	}
}
