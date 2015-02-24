import java.util.*;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class deck {

  /**
   * cards contains all the cards in the deck.
   */
  private List<card> cards;

  /**
   * size is the number of not-yet-dealt cards.
   * Cards are dealt from the top (highest index) down.
   * The next card to be dealt is at size - 1.
   */
  private int size;


  /**
   * Creates a new <code>Deck</code> instance.<BR>
   * It pairs each element of ranks with each element of suits,
   * and produces one of the corresponding card.
   * @param ranks is an array containing all of the card ranks.
   * @param suits is an array containing all of the card suits.
   * @param values is an array containing all of the card point values.
   */
  public deck(String[] ranks, String[] suits, int[] values) {
    cards = new ArrayList<card>();
    for (int j = 0; j < ranks.length; j++) {
      for (String suitString : suits) {
        cards.add(new card(ranks[j], suitString, values[j]));
      }
    }
    size = cards.size();
    //shuffle();
  }


  /**
   * Determines if this deck is empty (no undealt cards).
   * @return true if this deck is empty, false otherwise.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Accesses the number of undealt cards in this deck.
   * @return the number of undealt cards in this deck.
   */
  public int size() {
    return size;
  }

  /**
   * Randomly permute the given collection of cards
   * and reset the size to represent the entire deck.
   */
  public void shuffle() 
  
  {
    Random num = new Random(); //This creates a new Random object called num
    
   //for (int j= 0 ; j<cards.size(); j++)// This loop prints out the deck of cards before shuffled
    // System.out.println((Card)cards.get(j));//Have to typecast here to print out the object
   
   for (int j= 0 ; j<cards.size(); j++) // This loop loops over the size of your deck. In a standard deck it will go 0-51 or 52 cards
   {                                    //size is a method of ArrayList
     card top = cards.get(0);// This is saving the top card to top. Remember the card is a Card object
     cards.remove(cards.get(0));// This removes the card from the ArrayList thus from the deck
     cards.add(num.nextInt(cards.size()),top);// This adds the card back into the deck or the ArrayList in a random position from 0 to 51. 
   }                                          // You can see here now that we had to save the first card as top so knew what to put back!!!
   
   //for (int j= 0 ; j<cards.size(); j++)   //This will print out the deck again so you will see they are all there but mixed up.
     //System.out.println((Card)cards.get(j));
  }

  /**
   * Deals a card from this deck.
   * 
   * @return the card just dealt, or null if all the cards have been
   *         previously dealt.
   */
  public card deal() {
    if (isEmpty()) {
      return null;
    }
    size--;
    card c = cards.get(0);//size
    return c;
  }
  
  public List getCards()
  {
    return cards;
    
  }
  
  public void AddCard(card newcard)
  {
    cards.add(newcard);
    size++;
  }
  
  public void RemoveCard(card newcard)
  { cards.remove(newcard);
    size--;
  }

 
  public String toString() {
    String rtn = "size = " + size + "\nUndealt cards: \n";

    for (int k = size - 1; k >= 0; k--) {
      rtn = rtn + cards.get(k);
      if (k != 0) {
        
        rtn = rtn + ", ";
      }
      if ((size - k) % 2 == 0) {
        // Insert carriage returns so entire deck is visible on console.
        rtn = rtn + "\n";
      }
    }

    rtn = rtn + "\nDealt cards: \n";
    for (int k = cards.size() - 1; k >= size; k--) {
      rtn = rtn + cards.get(k);
      if (k != size) {
        rtn = rtn + ", ";
      }
      if ((k - cards.size()) % 2 == 0) {
        // Insert carriage returns so entire deck is visible on console.
        rtn = rtn + "\n";
      }
    }

    rtn = rtn + "\n";
    return rtn;
  }
 
}