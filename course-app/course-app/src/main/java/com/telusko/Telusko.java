package com.telusko;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.telusko.service.ICourse;
import org.springframework.context.annotation.Bean;


@Component
public class Telusko 
{ 
	@Autowired
	@Qualifier("java")
	private ICourse course;
	public String getTheCourse()
	{
		return course.registerCourse();
	}

}
