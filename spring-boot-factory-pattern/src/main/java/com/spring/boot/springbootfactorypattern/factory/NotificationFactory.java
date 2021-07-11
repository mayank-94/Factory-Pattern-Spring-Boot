/**
 * 
 */
package com.spring.boot.springbootfactorypattern.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;

import com.spring.boot.springbootfactorypattern.factory.notification.INotification;

/**
 * @author mayankjain
 *
 */
public class NotificationFactory {
	private static final Map<String, Class<? extends INotification>> instances = new HashMap<>();
	
	public static void register(final String notification, final Class<? extends INotification> instance) {
		if(null != notification && null != instance)
			instances.put(notification, instance);
	}
	
	public static INotification getInstance(final ApplicationContext context, final String notification) {
		if(instances.containsKey(notification)) {
			return context.getBean(instances.get(notification));
		}
		
		return null;
	}
}
