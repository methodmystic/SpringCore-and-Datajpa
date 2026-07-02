package com.telusko.repo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;



@Repository
@Scope("prototype")
public class RepoLayer
{
	public RepoLayer()
	{
		System.out.println("Repo Bean is created");
	}

}

