package com.mindgate.application;

import com.mindgate.domain.Message;

public class Application
{
	
//	Has a relationship -MessageApplication as a relationship with message
	Message message;
	
	public Application(Message message) {
		this.message = message;
	}

	public void ProcessMessage(String to, String from,String text){
//		Message message =new Message();
		message.sendmessage(to,from,text);
	}
	

}
