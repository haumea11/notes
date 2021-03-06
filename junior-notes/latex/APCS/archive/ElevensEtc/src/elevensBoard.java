import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class elevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
     public elevensBoard() {
         super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
     }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        if(selectedCards.size() == 2)
        	if(containsPairSum11(selectedCards) == true)
        		return true;
        	else
        		return false;
        else
        	if(selectedCards.size() == 3)
        		if(containsJQK(selectedCards) == true)
        			return true;
        		else
        			return false;
        	else
        		return false;
    }


    @Override
    public boolean anotherPlayIsPossible() {
        List<Integer> selected = cardIndexes();
        return containsPairSum11(selected) || containsJQK(selected);
    }

   
    private boolean containsPairSum11(List<Integer> selectedCards) {
        for(int i = 0; i < selectedCards.size(); i++)
        {
        	for(int j = selectedCards.size()-1; j>0; j--)
        	{
        		if(selectedCards.get(i).intValue()+selectedCards.get(j).intValue() == 11)
        			return true;
        		else 
        			return false;
        	}
        }
		return false;
    }

   
    private boolean containsJQK(List<Integer> selectedCards) {
    	 boolean foundJack=false;
    	 boolean foundKing=false;
    	 boolean foundQueen=false;
    	  
    	     for(Integer kObj : selectedCards)
    	          {
    	              if(cardAt(kObj).rank()=="Jack")
    	              {
    	                  foundJack=true;
    	              }
    	              else if(cardAt(kObj).rank()=="Queen")
    	              {
    	                  foundQueen=true;
    	              }
    	              else if(cardAt(kObj).rank()=="King")
    	              {
    	                  foundKing=true;
    	              }
    	          }
    	     return foundJack && foundQueen && foundKing;
    }
}
