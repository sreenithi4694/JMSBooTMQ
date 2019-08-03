package com.webspringbootexample.listener;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SearchAppListener {
	@JmsListener(destination ="in.search")
	@SendTo("out.search")
	public String recieveMessageIn(final Message jsonMessage) {
		System.out.println(jsonMessage);
		return "Successfully Recieved OUT";
	}
	
	@JmsListener(destination ="out.search")
	public String recieveMessageOut(final Message jsonMessage) {
		System.out.println(jsonMessage);
		return "Successfully Recieved In";
	}
}
