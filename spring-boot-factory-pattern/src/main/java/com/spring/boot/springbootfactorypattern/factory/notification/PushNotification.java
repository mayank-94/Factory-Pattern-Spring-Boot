/**
 * 
 */
package com.spring.boot.springbootfactorypattern.factory.notification;

import org.springframework.stereotype.Component;

import com.spring.boot.springbootfactorypattern.factory.NotificationFactory;

/**
 * @author mayankjain
 *
 */
@Component
public class PushNotification implements INotification{
	
	static {
		NotificationFactory.register("Push", PushNotification.class);
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Push Notification sent..");
	}
}
