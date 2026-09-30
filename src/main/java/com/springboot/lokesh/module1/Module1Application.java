package com.springboot.lokesh.module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {
    @Autowired
    private PaymentService paymentService;
    private NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}
    public Module1Application(NotificationService notificationService){
        this.notificationService = notificationService;
        notificationService.send();
    }
    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
    }
}
