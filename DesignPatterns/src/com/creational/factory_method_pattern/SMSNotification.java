package com.creational.factory_method_pattern;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification");
	}

}
