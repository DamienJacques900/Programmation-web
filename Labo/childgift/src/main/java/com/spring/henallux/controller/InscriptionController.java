package com.spring.henallux.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.MagicKeyForm;
import com.spring.henallux.model.User;
import com.spring.henallux.service.HobbiesService;


@Controller
@RequestMapping(value="/userInscription")
public class InscriptionController 
{
	@Autowired
	private HobbiesService hobbiesService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("user",new User());
		model.addAttribute("hobbies", hobbiesService.getListHobby());
		return "integrated:userInscription";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String getFormData(Model model, @Valid @ModelAttribute(value="user") User user, final BindingResult errors)
	{
		if(!errors.hasErrors())
			return "integrated:gift";
		return "redirect:/userInscription";
	}
}