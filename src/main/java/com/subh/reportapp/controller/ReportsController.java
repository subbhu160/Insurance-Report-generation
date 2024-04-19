package com.subh.reportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.subh.reportapp.service.CitizenService;

public class ReportsController 
{
	@Autowired
	private CitizenService citizenService;
	
	@GetMapping("/")
	public String getData()
	{
		return "my first project";
		
	}

}
