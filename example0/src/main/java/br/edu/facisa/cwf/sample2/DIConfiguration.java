package br.edu.facisa.cwf.sample2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(value={"br.edu.facisa.cwf.sample2"})
public class DIConfiguration {
 
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}