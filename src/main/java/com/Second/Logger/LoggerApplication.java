package com.Second.Logger;

import com.Second.Component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.Second.Component") //UC1
@SpringBootApplication
public class LoggerApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context=SpringApplication.run(LoggerApplication.class, args);
		System.out.println("Checking Context:"+context.getBean(DemoBean.class));
	}

}
