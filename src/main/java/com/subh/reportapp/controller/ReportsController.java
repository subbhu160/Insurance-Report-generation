package com.subh.reportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.subh.reportapp.request.SearchRequest;
import com.subh.reportapp.service.CitizenService;

@Controller
public class ReportsController 
{
	@Autowired
	private CitizenService citizenService;
	
	@GetMapping("/")
	public String getData(Model model)
	
	{
		model.addAttribute("search",new SearchRequest());
	model.addAttribute("name",citizenService.getPlanNames());
	model.addAttribute("status",citizenService.getPlanNames());
		return "index";
		
	}

}
