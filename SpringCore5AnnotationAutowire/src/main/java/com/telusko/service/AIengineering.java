package com.telusko.service;
import org.springframework.stereotype.Service;
@Service("ai")
public class AIengineering implements Icourse {
	public AIengineering() 
	{
		System.out.println("AIengineering bean created");
	}
	public boolean registerTheCourse(double amount) 
	{
		System.out.println("You are registered for AIengineering course");
		return true;
	}

}
