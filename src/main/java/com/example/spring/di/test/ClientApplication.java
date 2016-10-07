package com.example.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.di.configuration.DIConfiguration;
import com.example.spring.di.consumer.MyApplication;

public class ClientApplication {

		public static void main(String[] args){
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
			MyApplication app = context.getBean(MyApplication.class);
			app.processMessage("hi Jimmy", "Jay");
			
			//close the context;
			context.close();
		}
}
