package com.spring.henallux.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService 	
{
	
	public String chooseGift(String hobby, int age)
	{
		if(age<=5)
		{
			return "Tu re�ois un puzzle � propos de "+hobby;
		}
		else
		{
			if(age<=10)
			{
				return "Tu re�ois un DVD � propos de "+hobby;
			}
			else
			{
				return "Tu re�ois un livre � propos de "+hobby;
			}
		}
	}
}
