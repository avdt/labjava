package main.java.com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrivateMessage extends Message {
	String SenderName;
	String MessageContent;
	String ReceiverName;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String getSenderName(String SenderName) throws IOException {
		System.out.println("Имя");
		this.SenderName = SenderName;
		SenderName = reader.readLine();
		return SenderName;
	}

	public String getReceiverName(String ReceiverName) throws IOException {
		System.out.println("Имя получателя");
		this.ReceiverName = ReceiverName;
		ReceiverName = reader.readLine();
		return ReceiverName;
	}

	public String getMessageContent(String MessageContent) throws IOException {
		System.out.println("сообщение");
		this.MessageContent = MessageContent;
		SenderName = reader.readLine();
		return MessageContent;
	}
}
