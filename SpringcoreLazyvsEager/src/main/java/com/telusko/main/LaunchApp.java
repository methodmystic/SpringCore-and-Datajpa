package com.telusko.main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import com.telusko.service.ServiceLayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LaunchApp
{
	public static void main(String[] args) {
		//ApplicationContext 
		//Beanfactory
//		
//		ApplicationContext context =
//			    new ClassPathXmlApplicationContext("applicationconfig.xml");
//		
//		ServiceLayer service = context.getBean(ServiceLayer.class);
//		service.disp();
		
		BeanFactory factory = new DefaultListableBeanFactory();
	}
}