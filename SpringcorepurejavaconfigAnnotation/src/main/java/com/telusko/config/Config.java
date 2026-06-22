package com.telusko.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
@Configuration 
@ComponentScan(basePackages = {"com.telusko"})
public class Config
{
	public Config()
	{
	System.out.println("config bean created");
	}
	
	@Bean 
	public Password config1()
	{
		Password pass = new Password("SHA");//instance 
		return pass;
	}
}
