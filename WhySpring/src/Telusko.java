import services.Icourse;
import services.AIengineering;
import services.Devops;

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
	}
	
	public void setCourse(Icourse course) 
	{
		this.course = course;
	}
	public boolean buyCourse(double amount) 
	{
		return course.registerTheCourse(amount);
	}
	
	
	
}