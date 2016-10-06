package com.spring.henallux.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class User 
{
	@Size(min=3, max=30)
	private String name;
	@Min(value=1)
	@Max(value=20)
	private Integer age;
	private Boolean male;
	private String hobby;
	
	public User()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public Boolean getMale()
	{
		return male;
	}
	
	public String getHobby()
	{
		return hobby;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(Integer a)
	{
		age = a;
	}
	
	public void setMale(Boolean m)
	{
		male = m;
	}
	
	public void setHobby(String h)
	{
		hobby = h;
	}
}
