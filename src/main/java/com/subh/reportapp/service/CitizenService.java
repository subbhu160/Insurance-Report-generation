package com.subh.reportapp.service;

import java.time.LocalDate;
import java.util.List;

import com.subh.reportapp.entity.CitizenPlan;
import com.subh.reportapp.request.SearchRequest;
public interface CitizenService
{
	public List<String> getPlanNames();
	public List<String> getPlanStatus();
	public List<CitizenPlan> search(SearchRequest searchRequest);
	public boolean exportExcel();
	public boolean exportPdf();
	
	
}
