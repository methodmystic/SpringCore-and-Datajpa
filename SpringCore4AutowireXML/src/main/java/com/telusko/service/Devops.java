package com.telusko.service;

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
