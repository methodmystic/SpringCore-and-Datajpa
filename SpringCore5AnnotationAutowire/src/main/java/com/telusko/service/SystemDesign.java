package com.telusko.service;
import org.springframework.stereotype.Service;
@Service("sd")
public class SystemDesign implements Icourse {
	public SystemDesign() 
	{
		System.out.println("SystemDesign bean created");
	}
	public boolean registerTheCourse(double amount) 
	{
		System.out.println("You are registered for SystemDesign course");
		return true;
	}

}
