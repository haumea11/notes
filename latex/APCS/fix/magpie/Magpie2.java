/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf(" no ") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.toLowerCase().indexOf("mother") >= 0
				|| statement.toLowerCase().indexOf("father") >= 0
				|| statement.toLowerCase().indexOf("sister") >= 0
				|| statement.toLowerCase().indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
		{
			response = "INFORM ME OF THINE PETS.";
		}
		else if (statement.toLowerCase().indexOf("janet") >= 0 ||
				statement.toLowerCase().indexOf("anthony") >= 0)
		{
			response = "She's pretty cool, that Ms. Anthony.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you -really- think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "fear me;";
		}
		else if (whichResponse == 5)
		{
			response = "BEES.";
		}

		return response;
	}
}
/*
1st Question - One could use an Array List to
			store a set of combination responses
			to the sets of words.

2nd Question - Use spaces? Otherwise the word-in-word
			thing causes problems.

Hello, let's talk.
Janet Anthony is pretty nifty.
She's pretty cool, that Ms. Anthony.
Are we real?
You don't say.
I do say.
fear me;
bees?
Interesting, tell me more.
bees?
Hmmm.
BEES?
Interesting, tell me more.
BEEEEES?
You don't say.
BEEEEEEEEEES?
You don't say.
BEEEEEEEEEEEEEEEEES?
Hmmm.
bee
fear me;
fear me!;
fear me;

Hmmm.
hmmm
You don't say.
hmmmmmmm
fear me;
HMMMMMMMMMM
Interesting, tell me more.
just waiting on the last response
BEES.
and there it is
fear me;

*/