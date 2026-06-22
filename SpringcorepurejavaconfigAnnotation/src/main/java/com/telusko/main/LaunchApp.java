package com.telusko.main;
import com.telusko.config.Password;
import com.telusko.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class LaunchApp
{
	public static void main(String[] args)
	{
		//ApplicationContext 
		//Beanfactory
		
		ApplicationContext context =
			    new AnnotationConfigApplicationContext(Config.class);
		Password pass = context.getBean(Password.class);
	}
}