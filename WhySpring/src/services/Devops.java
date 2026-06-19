package services;
import services.Icourse;

public class Devops implements Icourse {
	public boolean registerTheCourse(double amount) 
	{
		System.out.println("You are registered for Devops course");
		return true;
	}

}
