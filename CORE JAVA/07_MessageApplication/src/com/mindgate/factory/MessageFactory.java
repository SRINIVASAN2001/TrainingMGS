package com.mindgate.factory;

import com.mindgate.domain.EmailMessage;
import com.mindgate.domain.Message;
import com.mindgate.domain.SmsMessage;
import com.mindgate.domain.WhatsappMessage;

public class MessageFactory 
{
	public Message getMessageObject(int choice)
	{
		if(choice==1)
		{
			return new WhatsappMessage();
		}
		if (choice ==2)
		{
			return new EmailMessage();
			
		}
		if(choice ==3)
		{
			return new SmsMessage();
		}
		return null;
	}

}
