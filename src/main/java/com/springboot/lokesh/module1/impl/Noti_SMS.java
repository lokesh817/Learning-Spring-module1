package com.springboot.lokesh.module1.impl;

import com.springboot.lokesh.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMS")
public class Noti_SMS implements NotificationService {
    @Override
    public void send() {
        System.out.println("sending sms...");
    }
}
