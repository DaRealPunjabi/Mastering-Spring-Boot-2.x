package com.example.learn.chapter1;

import com.example.learn.chapter1.business_components.ComplexLogicService;
import com.example.learn.chapter1.business_components.Mail;
import com.example.learn.chapter1.business_components.Sendable;
import com.example.learn.chapter1.business_components.SendableOfMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SupplyingBeans {

    @Bean
    public ComplexLogicService complexLogicService(
            @Autowired Sendable<Mail> sendable){
        return new ComplexLogicService(sendable);
    }
    @Bean
    public Sendable<Mail> createSendable(){
        return new SendableOfMail();
    }

}
