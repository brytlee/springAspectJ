package edu.miu.cs544.paweni.config;

import edu.miu.cs544.paweni.aspect.Logger;
import edu.miu.cs544.paweni.service.DatabaseService;
import edu.miu.cs544.paweni.service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public EmailService emailService() throws Exception{
        return new EmailService();
    }

    @Bean
    public DatabaseService databaseService() throws Exception{
        return new DatabaseService();
    }

    @Bean
    public Logger logger(){
        return new Logger();
    }
}
