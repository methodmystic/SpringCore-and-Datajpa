package com.telusko.service;
import org.springframework.stereotype.Service;

@Service("java")
public class Java implements ICourse
{
	@Override
	public String registerCourse() 
	{
		return "Java Course Registered";
	}

}
