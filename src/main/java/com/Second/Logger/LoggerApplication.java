package com.Second.Logger;

import com.Second.Component.DemoBean;
import com.Second.Component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot. SpringApplication;
import org.springframework.boot.autoconfigure. SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.Second")
public class LoggerApplication {
	public static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run (LoggerApplication.class, args);
		logger.debug("Checking Context: {}",context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid (104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
