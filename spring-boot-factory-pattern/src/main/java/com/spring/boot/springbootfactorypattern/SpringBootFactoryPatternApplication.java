package com.spring.boot.springbootfactorypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.boot.springbootfactorypattern.factory.NotificationFactory;
import com.spring.boot.springbootfactorypattern.factory.notification.INotification;

@SpringBootApplication
public class SpringBootFactoryPatternApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFactoryPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		INotification notification = NotificationFactory.getInstance(context, "SMS");
		notification.notifyUser();
	}
}
