package com.example.demo;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderSender {

	JmsTemplate jmsTemplate;
	
	public void send(OrderMessage message) {
		
		jmsTemplate.convertAndSend("Q2", message);
	}
}
