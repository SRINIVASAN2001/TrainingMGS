package com.mindgate.domain;

public class WhatsappMessage implements Message
{
	@Override
	public void sendmessage(String from, String to, String text)
	{
		System.err.println("Whatsapp Message is Sended Successfully!! ");
		System.out.println("Message is recieved from -->"+from);
		System.out.println("Message is sent to       -->"+to);
		System.out.println("Text Message is          -->"+text);
	}
		
}
