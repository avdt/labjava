package main.java.com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Message {

	String SenderName;	
	String MessageContent;
	// should be
	// private String senderName;
	// private String messageContent;

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // should be private

	public String getSenderName(String SenderName) throws IOException {
		this.SenderName = SenderName;
		
		// this code should be separated into another class called kinda MessagePopulator
		System.out.println("Èìÿ");
		SenderName = reader.readLine();
		return SenderName;

	}
	
	//should be
	/*
	public String getSenderName(){
		return senderName;
	}
	public void setSenderName(String snederName){
		this.senderName = senderName;
	}
	*/

	public String getMessageContent(String MessageContent) throws IOException {
		this.MessageContent = MessageContent;
		
		// this code should be separated into another class called kinda MessagePopulator
		System.out.println("Ñîîáùåíèå");
		MessageContent = reader.readLine();
		return MessageContent;
	}
	// should be
	/*
	public String getMessageContent(){
		return messageContent;
	}
	
	public void setMessageContent(String messageContent){
		this.messageContent = messageContent;
	}
	*/

}
