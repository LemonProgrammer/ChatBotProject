package chat.view;

import javax.swing.JOptionPane;
import chat.model.ChatBot;

public class ChatBotView
{
	private ChatBot myChatbot;
	
	public ChatBotView()
	{
		myChatbot = new ChatBot();
	}
	
	/**
	 * This method loops
	 */
	public void showApp()
	{
		String input = "keep going";
		
		while(input == null || !input.equalsIgnoreCase("no"))
		{
			input = getInput();
			if (input != null || input.equalsIgnoreCase("no"))
			{
				JOptionPane.showMessageDialog(null, myChatbot.getRandomTopic());
				input = getInput();
				useInput(input);
			}
		}
		myChatbot.conversationPiece();
	}
	
	/**
	 * Captures the users input based on a question.
	 * @return The String object typed by the user.
	 */
	private String getInput()
	{
		String input = "";
		
		input = JOptionPane.showInputDialog("Hi there, let's talk.");
		
		return input;
	}
	
	/**
	 * 
	 * @param userInput
	 */
	
	private void useInput(String userInput)
	{
		if(myChatbot.MemeChecker(userInput))
				{
					JOptionPane.showMessageDialog(null, "I knew that " + userInput + " is a meme!!!");
				}
		JOptionPane.showMessageDialog(null, "Wow that is so interesting that you want to talk with me about " 
				+ userInput);
	}
	
}
