package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.application.Application;
import com.mindgate.domain.EmailMessage;
import com.mindgate.domain.Message;
import com.mindgate.domain.WhatsappMessage;
import com.mindgate.factory.MessageFactory;

public class MessageApplicationMainV1 {

	public static void main(String[] args) {
		
//		Application application =new Application();
//		application.ProcessMessage();
		
//		Message message = new Message();
		
//		Message message=new WhatsappMessage();
//		Message message=new EmailMessage();
		
		
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Message Menu!!!!");
		System.out.println("1.Whatsapp Message");
		System.out.println("2.Email Message");
		System.out.println("3.SMS Message\n");
		System.out.println("Enter your Choice here ..");
		int choice=scanner.nextInt();
		
		MessageFactory  factory=new MessageFactory();
		Message message=factory.getMessageObject(choice);
		
		Application application=new Application(message);
		
		application.ProcessMessage("rajesh","Vijay","Hi Buddy!!");
	}

}
