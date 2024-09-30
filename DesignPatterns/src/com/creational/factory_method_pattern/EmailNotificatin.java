package com.creational.factory_method_pattern;

public class EmailNotificatin implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email notification");
	}

}
