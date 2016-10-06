package com.example.spring.di.service;

public class TwitterService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String rec) {
		
		System.out.println("Twitter sent to " + rec + " with Message = " + msg);
		return true;
	}
}
