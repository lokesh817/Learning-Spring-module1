package com.springboot.lokesh.module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {

    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
}
