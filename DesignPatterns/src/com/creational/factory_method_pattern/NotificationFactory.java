package com.creational.factory_method_pattern;

public abstract class NotificationFactory {
	public abstract Notification createNotification();
	public void notifyUser() {
		Notification notification = createNotification();
		notification.notifyUser();
	}
}
