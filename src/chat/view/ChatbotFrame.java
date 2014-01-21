package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatBotController;

public class ChatbotFrame extends JFrame
{
	private ChatBotController baseController;
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatBotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
}
