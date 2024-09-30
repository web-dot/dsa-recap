package com.creational.factory_method_pattern;

public class TestFactoryPattern {
	
	
	public static void main(String[] args) {
		NotificationFactory emailFactory = new EmailNotificationFactory();
		emailFactory.notifyUser();
		
		NotificationFactory smsFactory = new SMSNOtificationFactory();
		smsFactory.notifyUser();
	}
}
