package com.creational.factory_method_pattern;

public class EmailNotificationFactory extends NotificationFactory {

	@Override
	public Notification createNotification() {
		return new EmailNotificatin();
	}

}
