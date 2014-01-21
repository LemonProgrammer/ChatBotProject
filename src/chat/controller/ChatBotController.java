package chat.controller;

import java.util.ArrayList;

import chat.model.ChatBot;
import chat.view.ChatBotView;
import chat.view.ChatbotFrame;
/**
 * 
 * @author fbla1201
 * @version 1.3 10/23/2013 Adding model to the project. Added a getter for the object
 */
public class ChatBotController
{
//	private ChatBotView appView;
	private ChatbotFrame appFrame;
	/**
	 * The main chatbot for the application.
	 */
	private ChatBot appBot;
	
	public ChatBotController () 
	{
//		appView = new ChatBotView();
		appBot = new ChatBot();
	}
	
	public ChatbotFrame getAppFrame()
	{
		return appFrame;
	}

	public void setAppFrame(ChatbotFrame appFrame)
	{
		this.appFrame = appFrame;
	}

	public ChatBot getAppBot()
	{
		return appBot;
	}

	public void setAppBot(ChatBot appBot)
	{
		this.appBot = appBot;
	}

	public void start()
	{
//		appView.showApp();
		appFrame = new ChatbotFrame(this);
	}
	
	public String proccessUserInput(String currentInput)
	{
		String response = "";
		
		if (appBot.MemeChecker(currentInput) )
		{
			response = "memes!!!";
		}
		else if(true)
		{
			
		}
		
		return response;
		
	}
	
	public String MemeValidation(String userInput)
	{
		String MemeReaction = "Why are we not talking about Memes?";
		if(appBot.MemeChecker(userInput))
		{
			MemeReaction = userInput + " is the best Meme ever";
		}
		
		return MemeReaction;
		
	}
	
	private String conversationHelper(ArrayList<String> currentList)
	{
		String currentPhrase = "";
		
		if (currentList.size() > 0)
		{
			currentPhrase = currentList.remove(0);
		}

		return currentPhrase;
		
	}
	
	
	public String dominateTheConversation()
	{
		String currentConversationPiece = "";
		
		currentConversationPiece = conversationHelper(appBot.conversationPiece());
		
		return currentConversationPiece;
	}
}
