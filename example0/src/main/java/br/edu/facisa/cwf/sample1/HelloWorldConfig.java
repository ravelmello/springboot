package br.edu.facisa.cwf.sample1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
 
@Configuration
public class HelloWorldConfig {
 
    @Bean(name="h1")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
 
}