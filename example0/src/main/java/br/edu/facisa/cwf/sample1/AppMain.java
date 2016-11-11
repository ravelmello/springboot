package br.edu.facisa.cwf.sample1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 
public class AppMain {
 
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("h1");
        bean.sayHello("Spring 4");
        context.close();
    }
 
}