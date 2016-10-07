package com.example.spring.di.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.di.consumer.MyXMLApplication;

public class ClientXMLApplication {
	
	public static void main(String[] args){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = (MyXMLApplication) context.getBean("MyXMLApp");
		
		app.processMessage("Hi Jay", "Jay");
		
		//close the context
		context.close();
	}
}
