package com.springboot.lokesh.module1;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    void pay(){
        System.out.println("Paying... ");
    }
}
