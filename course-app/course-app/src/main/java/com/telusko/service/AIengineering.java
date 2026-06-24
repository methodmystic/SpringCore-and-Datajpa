package com.telusko.service;
import org.springframework.stereotype.Service;
@Service
public class AIengineering implements ICourse
{
  
	@Override
	public String registerCourse() {
		return "AI Engineering Course Registered";
	}
}
