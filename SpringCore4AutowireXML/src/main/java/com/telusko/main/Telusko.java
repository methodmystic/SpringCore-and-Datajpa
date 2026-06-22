package com.telusko.main;
import com.telusko.service.Icourse;


public class Telusko
{
	private Icourse course;
	

	public Telusko(Icourse course)
	{
		super();
		this.course = course;
	}
	public Telusko()
	{
		super();
		System.out.println("Telusko bean created(constructor)");
	}
	
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