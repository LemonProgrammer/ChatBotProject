package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	private ArrayList<String> myMemes;
	private ArrayList<String> myHoliday;
	private ArrayList<String> mySuperHero;
	/**
	 * Stores a list of random topics
	 */
	private ArrayList<String> myRandomList;
	private ArrayList<String> conversationList;
/**
 * A Constructor that initializes the ArrayLists to different lists of different topics.
 */
	public ChatBot()
	{
		myMemes = new ArrayList<String>();
		myHoliday = new ArrayList<String>();
		mySuperHero = new ArrayList<String>();
		myRandomList = new ArrayList<String>();
		conversationList = new ArrayList<String>();

		filltheRandomList();
		filltheSuperHeroList();
		filltheHolidayList();
//		fillTheConversationList();
	}
	/**
	 * Helper method that fills the myMemeList with strings.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("What does the fox say?");
		myMemes.add("Bad luck Craig");
		myMemes.add("Philosoraptor");
		myMemes.add("Rage face");
		myMemes.add("Cats");
		myMemes.add("Honey Badgers");
	}

	/**
	 * Helper method to fill the myRandomList with strings.
	 */
	private void filltheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("I have to say something random?");
		myRandomList.add("dogs");
		myRandomList.add("pomengranites");
		myRandomList.add("raisins");
		myRandomList.add("Godzilla");
	}

	/**
	 *  This method helps to fill up the filltheHolidayList with strings that
	 * has been given a name.
	 */
	private void filltheHolidayList()
	{
		myHoliday.add("Christmas");
		myHoliday.add("Halloween");
		myHoliday.add("New Years");
		myHoliday.add("Valentines");
		myHoliday.add("Boxing Day");
		myHoliday.add("Tomato Day");
		myHoliday.add("Mother's day");
		myHoliday.add("Chinese New Years");
		myHoliday.add("Tag Day");
		myHoliday.add("Thor's day");
		myHoliday.add("Kwanza day");
		myHoliday.add("Knishmas");
		myHoliday.add("Slap a Monkey Day");
	}

		/**
		 * Helper method that fills the superHeroList with strings.
		 */
	private void filltheSuperHeroList()
	{

		mySuperHero.add("Spiderman");
		mySuperHero.add("Hulk");
		mySuperHero.add("Thor");
		mySuperHero.add("Ironman");
		mySuperHero.add("Captain America");
		mySuperHero.add("Wolverine");
		mySuperHero.add("The Punisher");
		mySuperHero.add("Ghost Rider");
		mySuperHero.add("DareDevil");
		mySuperHero.add("HellBoy");
		mySuperHero.add("Storm");
		mySuperHero.add("Cyclops");

	}

	/**
	 * Method to retrieve a random value from the myRandomList.
	 * 
	 * @return The String value randomly selected from the list.
	 */
	public String getRandomTopic()
	{
		String randomTopic = "";

		double myRandomNumber = Math.random();
		int myRandomListPosistion = (int) (myRandomNumber * myRandomList.size());
		randomTopic = myRandomList.get(myRandomListPosistion);

		return randomTopic;
	}


	/**
	 * This method checks the validation of the Meme that is currently being
	 * mentioned.
	 * 
	 * @param currentMeme
	 * @return isMeme
	 * 
	 */
	public boolean MemeChecker(String currentMeme)
	{
		boolean isMeme = false;

		if (currentMeme != null)
		{
			for (String currentMemeChat : myMemes)
			{
				if (currentMeme != null
						|| currentMeme.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}
		}
		return isMeme;
	}
/**
 * 
 * @param currentHero
 * @return
 */
	public boolean heroChecker(String currentHero)
	{
		boolean isHero = false;

		if (currentHero != null)
		{
			for (String currentSuperHero : mySuperHero)
			{
				if (currentHero != null
						|| currentHero.equalsIgnoreCase(currentHero))
				{
					isHero = true;
				}

			}
		}
		return isHero;
	}

	/**
	 * The method makes the computer talk with the person.
	 * 
	 * @return conversationPiece1
	 */
	public String conversationPiece1()
	{
		// Must have at least 3 lines of interaction with the user aka
		// JOptionPane.showInputDialog.

		JOptionPane
				.showInputDialog(null, "Hi there, mind if we chat a little?");
		JOptionPane.showInputDialog(null, "Are you sure?");
		JOptionPane.showMessageDialog(null,
				"Ok,  we're gonna talk no matter what.");
		String strangeAnswer = JOptionPane.showInputDialog(null,
				"Are you my Daddy?");
		if (strangeAnswer.equalsIgnoreCase("yes"))
		{
			JOptionPane
					.showInputDialog(null,
							"Ok, where were you when I was performing my piano recital");
			JOptionPane.showMessageDialog(null,
					"Nice excuse, too bad your existence isn't");

		} else if (strangeAnswer.equalsIgnoreCase("no"))
		{
			JOptionPane.showInputDialog(null,
					"Im pretty sure you are my daddy.");
			JOptionPane.showInputDialog(null, "Well lets go meet mommy.");
		} else
		{
			JOptionPane.showMessageDialog(null,
					"Don't you dare go anywhere, we have a lot to talk about.");
		}
		JOptionPane.showMessageDialog(null, "let's talk about super heroes.");

		JOptionPane.showInputDialog(null, "what's your favorite super hero?");
		return conversationPiece1();
	}

	/**
	 * 
	 * @param me
	 *            a is string that contains the name.
	 * @param you
	 *            a is string that contains a different name.
	 * @param other
	 *            is a string that contains another different name.
	 * @return aFineOrder returns the order of the strings based on the builtin
	 *         method.
	 */

	public String putNameInAplphabeticOrder(String me, String you, String other)
	{
		String aFineOrder = "";

		if (me.compareTo(you) < 0)
		{
			if (you.compareTo(other) < 0)
			{
				if (other.compareTo(me) > 0)
				{
					aFineOrder = me + ", " + other + ", " + you;
				} else
				{
					aFineOrder = me + ", " + you + ", " + other;
				}
			} else
			{
				aFineOrder = other + ", " + me + ", " + you;
			}
		} else
		{
			aFineOrder = you + ", " + me + ", " + other;
		}

		return aFineOrder;
	}
/**
 * 
 */
	private void fillTheConversationList()
	{
		conversationList.add("\n" + "nope");
		conversationList.add(conversationPiece1());

	}
/**
 * 
 * @return conversationList
 */
	public ArrayList<String> conversationPiece()
	{

		return conversationList;

	}
}
