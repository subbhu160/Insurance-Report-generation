package com.subh.reportapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.subh.reportapp.entity.CitizenPlan;
import com.subh.reportapp.request.SearchRequest;
import com.subh.reportapp.service.CitizenService;

@Controller
public class ReportsController 
{
	@Autowired
	private CitizenService citizenService;
	
	@PostMapping("/search")
	public String searchData(@ModelAttribute("search") SearchRequest request,Model model)
	{
		
		System.out.println(request);
		List<CitizenPlan> plans = citizenService.search(request);
		 model.addAttribute("plans",plans);
		init(model);
		return "index";
	}
	
	@GetMapping("/")
	public String getData(Model model)
	
	{
		model.addAttribute("search",new SearchRequest());
	    init(model);
		return "index";
		
	}

	private void init(Model model) {
		//model.addAttribute("search",new SearchRequest());
		model.addAttribute("name",citizenService.getPlanNames());
	    model.addAttribute("status",citizenService.getPlanStatus());
	}

}
