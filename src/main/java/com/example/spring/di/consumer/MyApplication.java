package com.example.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.spring.di.service.MessageService;

@Component
public class MyApplication {

	
		//field-based dependency injection
		//@Autowired
		private MessageService service;
		
		//constructor-based dependency injection
		//@Autowired
		
		
		@Autowired
		@Qualifier("emailService")
		public void setService(MessageService svc){
			this.service=svc;
		}
		
		public boolean processMessage(String msg, String rec){
			return this.service.sendMessage(msg, rec);
		}
}
