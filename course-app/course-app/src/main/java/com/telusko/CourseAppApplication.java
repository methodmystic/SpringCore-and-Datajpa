package com.telusko;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.telusko.service.Java;

@SpringBootApplication
public class CourseAppApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(CourseAppApplication.class, args);
		Telusko telusko = context.getBean(Telusko.class);
		System.out.println(telusko.getTheCourse());
	}

}
