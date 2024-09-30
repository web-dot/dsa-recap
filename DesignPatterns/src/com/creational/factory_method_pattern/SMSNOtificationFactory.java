package com.creational.factory_method_pattern;

public class SMSNOtificationFactory extends NotificationFactory {

	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}

}
