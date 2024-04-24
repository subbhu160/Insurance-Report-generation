package com.subh.reportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.subh.reportapp.entity.CitizenPlan;

//@Repository
public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	@Query("Select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanName();
	
	@Query("Select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus();

}
