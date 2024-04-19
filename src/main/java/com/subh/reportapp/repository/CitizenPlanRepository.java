package com.subh.reportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.subh.reportapp.entity.CitizenPlan;


public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
//	@Query("select distinct(PlanName) from CitizenPlan")
//	public List<String> getPlanName();
//	
//	@Query("select distinct(Plan_Status) from citizen_plans_info")
//	public List<String> getPlanStatus();

}
