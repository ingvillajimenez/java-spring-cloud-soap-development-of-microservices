package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class SendMessageToQueue {

	@Autowired
	JmsTemplate jmsTemplate;
	
	public void send(String message) {
		jmsTemplate.convertAndSend("Q1", "Hello");
	}
}
