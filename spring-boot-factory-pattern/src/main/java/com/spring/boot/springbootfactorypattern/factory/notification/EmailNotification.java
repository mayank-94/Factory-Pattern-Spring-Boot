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
public class EmailNotification implements INotification {
	
	static {
		NotificationFactory.register("Email", EmailNotification.class);
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Email notification sent..");
	}
}
