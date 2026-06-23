package com.telusko.main;
import org.springframework.context.ApplicationContext;
import com.telusko.service.ServiceLayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
public class LaunchApp
{
	public static void main(String[] args) {
		//ApplicationContext 
		//Beanfactory
		
//		ApplicationContext context =
//			    new ClassPathXmlApplicationContext("applicationconfig.xml");
//		ServiceLayer service = context.getBean(ServiceLayer.class);
//		service.disp();
		
		//Beanfactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader (factory);
		
		//3.load the bean definitions from the XML file
		reader.loadBeanDefinitions(new ClassPathResource("applicationconfig.xml"));
		
		ServiceLayer service = factory.getBean(ServiceLayer.class);
		service.disp();
		
	}
}