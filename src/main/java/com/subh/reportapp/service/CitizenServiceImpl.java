package com.subh.reportapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.reportapp.entity.CitizenPlan;
import com.subh.reportapp.repository.CitizenPlanRepository;
import com.subh.reportapp.request.SearchRequest;

@Service
public class CitizenServiceImpl implements CitizenService{

	@Autowired
	 private CitizenPlanRepository crepo;
	
	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return crepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return crepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest searchRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
