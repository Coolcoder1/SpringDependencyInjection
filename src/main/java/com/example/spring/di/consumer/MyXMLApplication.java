package com.example.spring.di.consumer;



import com.example.spring.di.service.MessageService;

public class MyXMLApplication {
	//field-based dependency injection
			//@Autowired
			private MessageService service;
			
			//constructor-based dependency injection
			//@Autowired
			
			
			//setter-based dependency injection
			public void setService(MessageService svc){
				this.service=svc;
			}
			
			public boolean processMessage(String msg, String rec){
				return this.service.sendMessage(msg, rec);
			}
}
