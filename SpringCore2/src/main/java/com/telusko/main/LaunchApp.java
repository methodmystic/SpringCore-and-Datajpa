package com.telusko.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LaunchApp
{
	public static void main(String[] args) {
		//ApplicationContext 
		//Beanfactory
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("applicationconfig.xml");
	}
}