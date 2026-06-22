package com.telusko.main;
import com.telusko.service.Icourse;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component
public class Telusko
{
	private Icourse course;
	

	public Telusko(@Qualifier("ai")Icourse course)
	{
		super();
		System.out.println("constructor)");
		this.course = course;
	}
	
	@Autowired
	@Qualifier("ai")
	public void setCourse(Icourse course) 
	{
		System.out.println("setter injection");
		this.course = course;
	}
	
	public boolean buyCourse(double amount) 
	{
		return course.registerTheCourse(amount);
	}
	
}

// Qualifier dominates primary 