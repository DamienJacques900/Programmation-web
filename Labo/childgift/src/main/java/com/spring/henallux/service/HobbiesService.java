package com.spring.henallux.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.spring.henallux.model.Hobby;

@Service
public class HobbiesService 
{
	private ArrayList<Hobby> listHobby;
	
	public HobbiesService()
	{
		listHobby = new ArrayList<Hobby>();
		
		listHobby.add(new Hobby("1","Foot"));
		listHobby.add(new Hobby("2","Tennis"));
		listHobby.add(new Hobby("3","Natation"));
		listHobby.add(new Hobby("4","Cinéma"));
	}
	
	public void setListHobby(ArrayList<Hobby> lH)
	{
		listHobby = lH;
	}
	
	public ArrayList<Hobby> getListHobby()
	{
		return listHobby;
	}
}
