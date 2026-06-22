package com.telusko.config;

public class Password 
{
	String algo;
	
	public Password(String algo) 
	{
		this.algo = algo;
		System.out.println("password bean created");
		System.out.println(algo);
	}
	
	public String algoInfo()
	{
		return algo;
	}

}
