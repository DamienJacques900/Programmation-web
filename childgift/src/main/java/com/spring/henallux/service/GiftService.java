package com.spring.henallux.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService 	
{
	
	public String chooseGift(String hobby, int age)
	{
		if(age<=5)
		{
			return "Tu reçois un puzzle à propos de "+hobby;
		}
		else
		{
			if(age<=10)
			{
				return "Tu reçois un DVD à propos de "+hobby;
			}
			else
			{
				return "Tu reçois un livre à propos de "+hobby;
			}
		}
	}
}
