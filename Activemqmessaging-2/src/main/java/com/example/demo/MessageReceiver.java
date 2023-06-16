package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

public class MessageReceiver {
	
//	static String qname = "Q";
	
	@JmsListener(destination="Q")
	public void receiveMessage(@Payload String message, @Headers MessageHeaders headers) {
		
		// active task once you receive message
		
		System.out.println(message);
		System.out.println(headers.getTimestamp());
	}
}
