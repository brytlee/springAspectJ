package edu.miu.cs544.paweni;

import edu.miu.cs544.paweni.config.SpringConfig;
import edu.miu.cs544.paweni.service.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application Start");

        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        EmailService emailService = applicationContext.getBean(EmailService.class);

        emailService.sendEmail();

        System.out.println("Application End");
    }
}
