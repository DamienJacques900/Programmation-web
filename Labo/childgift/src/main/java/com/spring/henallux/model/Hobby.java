package com.spring.henallux.model;

public class Hobby 
{
	private String id;
	private String name;
	
	public Hobby(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Hobby()
	{

	}
	
	public void setId(String i)
	{
		id = i;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}
