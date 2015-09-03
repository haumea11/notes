// John "groovy" Markiewicz
// APCS Final
// That Christmas War- I mean Peace thing

// Menacing name for effect, of course.
// Not exactly like menacing is necessary here.
public class finalGame {

	public static void main(String[] args){
		
		String [] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Elf", "Reindeer", "Santa", "Star"};
		String [] cardSuit = {"Tree", "Stocking", "Holly", "Mistletoe"};
		int [] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		// For testing purposes:
		// System.out.println(c.getRank()+" of "+c.getSuit());
		
		// Now here is where it gets fun.
		// Interestingly enough, I have run into the "problem" on my first time through that everyone wins all the time.
		// I don't know if you can call that a real problem, but since resources are limited, we should fix this.
		int p1pts;
		p1pts = 0;
		int p2pts;
		p2pts = 0;
		for(int k=0; k<=4; k++){
		deck a = new deck(cardRank,cardSuit,cardValue);
		a.shuffle();
		card c = a.deal();
		
		deck b = new deck(cardRank,cardSuit,cardValue);
		b.shuffle();
		b.deal();
		b.shuffle();
		card d = b.deal();
		
		if(c.CompareCards(c, d) == 0){
			System.out.println("Merry Christmas... Player 1 is the winner, and Merry Christmas... Player 2 is also the winner!");
			p1pts++;
			p2pts++;
		}
		else if(c.CompareCards(c, d) == 1){
			System.out.println("Merry Christmas, Merry Christmas... Player 2 finds success! Player 2 is the winner.");
			p2pts++;
			p2pts++;
		}
		else {
			System.out.println("Merry Christmas, Merry Christmas... Player 1 finds victory! Player 1 is the winner.");
			p1pts++;
			p1pts++;
		}
		a.RemoveCard(c);
		b.RemoveCard(d);
		}
		
		if(p1pts>p2pts)
			System.out.println("Player 1 has bested Player 2 in a true display of skill and wit.  Or a card game.");
		else if(p1pts == p2pts)
			System.out.println("This game has been an even match.  Player 1 and Player 2 are both winners, or neither is.");
		else
			System.out.println("Player 2 has bested Player 1 in a true display of skill and wit.  Or a card game.");
	}
}