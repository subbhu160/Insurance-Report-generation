package com.subh.reportapp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public List<CitizenPlan> search(SearchRequest searchRequest) {

       CitizenPlan entity = new CitizenPlan();

   if(null!=searchRequest.getPlanName() &&!"".equals(searchRequest.getPlanName()))
   {
	   entity.setPlanName(searchRequest.getPlanName());
   }
   if(searchRequest.getPlanStatus()!=null &&!"".equals(searchRequest.getPlanStatus()))
   {
	 entity.setPlanStatus(searchRequest.getPlanStatus());
   }
   if(searchRequest.getGender()!=null &&!"".equals(searchRequest.getGender()))
   {
	   entity.setGender(searchRequest.getGender());
   }
   if(searchRequest.getStartDate()!=null &&!"".equals(searchRequest.getStartDate()))
   {
	   
	   entity.setPlanStartDate(searchRequest.getStartDate());
   }
   if(searchRequest.getEndDate()!=null &&!"".equals(searchRequest.getEndDate()))
   {
	   entity.setPlanEndDate( searchRequest.getEndDate());
   }
		return crepo.findAll(Example.of(entity));
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
