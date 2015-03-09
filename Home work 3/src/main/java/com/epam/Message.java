package main.java.com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Message {

	String SenderName;
	String MessageContent;

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String getSenderName(String SenderName) throws IOException {
		this.SenderName = SenderName;
		System.out.println("Имя");
		SenderName = reader.readLine();
		return SenderName;

	}

	public String getMessageContent(String MessageContent) throws IOException {
		this.MessageContent = MessageContent;
		System.out.println("Сообщение");
		MessageContent = reader.readLine();
		return MessageContent;
	}

}
