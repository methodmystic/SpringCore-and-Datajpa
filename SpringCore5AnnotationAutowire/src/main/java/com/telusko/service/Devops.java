package com.telusko.service;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
@Service("dev")
@Primary
public class Devops implements Icourse {
	public Devops() 
	{
		System.out.println("Devops bean created");
	}
	public boolean registerTheCourse(double amount) 
	{
		System.out.println("You are registered for Devops course");
		return true;
	}

}
