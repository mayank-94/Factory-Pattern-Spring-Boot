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
public class SMSNotification implements INotification{
	
	static {
		NotificationFactory.register("SMS", SMSNotification.class);
	}
	
	@Override
	public void notifyUser() {
		System.out.println("SMS notification sent..");
	}
}
