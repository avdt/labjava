package main.java.com.epam;

import java.io.IOException;

public class Server extends PrivateMessage {
	public void chat() throws IOException {
		Message message = new Message();
		message.getSenderName(SenderName);
		message.getSenderName(SenderName);
		message.getMessageContent(MessageContent);
		message.getMessageContent(MessageContent);

		PrivateMessage privat = new PrivateMessage();
		privat.getSenderName(SenderName);
		privat.getReceiverName(ReceiverName);
		privat.getMessageContent(MessageContent);
		message.getMessageContent(MessageContent);
	}
}
