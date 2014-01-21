package chat.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.ChatBotController;
import chat.model.ChatBot;

/**
 * 
 * @author fbla1201
 * @version 1.6 10/31/13 added new methods.
 */
public class ChatbotPanel extends JPanel
{
	private ChatBotController baseController;
	private ChatBot appBot;
	private SpringLayout baseLayout;
	private JButton submitChatButton;
	private JTextField userTextField;
	private JTextArea chatArea;
	private int clickCount;
	private String userInput;
	private JScrollPane chatPane;
	
	/**
	 * Creates a ChatbotPanel with a linked ChatbotController object.
	 * @param baseController
	 */
	public ChatbotPanel(ChatBotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getAppBot();
		baseLayout = new SpringLayout();
		submitChatButton = new JButton("Click here to go on an awesome magical journey!");
		chatArea = new JTextArea(10, 30);
		userTextField = new JTextField(30);
		chatPane = new JScrollPane(chatArea);

		clickCount = 0;
		
		setupPanel();
		setupLayout();
		setupListeners();
		
		setupChat();
	}
/**
 * creates listeners for all user interactive objects in the panel.	
 */
	private void setupListeners()
	{
		submitChatButton.addActionListener(new ActionListener()
		{
			/**
			 * Do this when the submitChatButton is clicked.
			 * 
			 */
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				if(clickCount%7 == 0)
				{
					String currentPhrase = baseController.dominateTheConversation();
					if (currentPhrase.length() != 0)
					{
					chatArea.append("\n" + currentPhrase);
					clickCount--;
					}
				}
				else if (clickCount % 5 == 0)
				{
					chatArea.append("\n" + baseController.MemeValidation(userInput));
				}
				else {
				String userInput = userTextField.getText();
				chatArea.append("\n" + userInput);
				userTextField.setText("");
				chatArea.append("\n" + appBot.getRandomTopic() + "\n");
				String processedInput = baseController.proccessUserInput(userInput);
				chatArea.append(processedInput);
				
				
				
				String me, you, other;
				me = "cat";
				you = "burger";
				other = "armidillo";
				chatArea.append(appBot.putNameInAplphabeticOrder(me, you, other));
				}
			
			}
		});
		
	}

		/**
		 * starts the chatbot screen with a topic.
		 */
	private void setupChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}
/**
 * places all objects with the computer generated code.
 */
	private void setupLayout()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(chatPane);
		this.add(submitChatButton);
		this.add(userTextField);
		
		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);
		
	}
	/**
	 * loads all components into the panel and sets the layout manager and color.
	 */
	private void setupPanel()
	{
		baseLayout.putConstraint(SpringLayout.WEST, submitChatButton, 91, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 18, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 103, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -98, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userTextField, 18, SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 18, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 103, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitChatButton, 18, SpringLayout.SOUTH, userTextField);
		baseLayout.putConstraint(SpringLayout.WEST, userTextField, 102, SpringLayout.WEST, this);
	}
}
