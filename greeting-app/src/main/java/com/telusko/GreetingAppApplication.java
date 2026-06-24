package com.telusko;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.telusko.service.IGreeting;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = 
				SpringApplication.run(GreetingAppApplication.class, args);
		IGreeting greet = container.getBean(IGreeting.class);
		
		System.out.println(greet.generateGreetings("Pranav"));
	}

}
