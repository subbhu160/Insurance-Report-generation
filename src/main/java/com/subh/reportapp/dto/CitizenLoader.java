package com.subh.reportapp.dto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.subh.reportapp.entity.CitizenPlan;
import com.subh.reportapp.repository.CitizenPlanRepository;



@Component
public class CitizenLoader implements ApplicationRunner
{
	@Autowired
	private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Shubham");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(500000.0);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Arun");
		c2.setGender("Male");
		c2.setPlanName("Medical");
		c2.setPlanStatus("Denied");
		c2.setDeniedRes("Property Income");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Payal");
		c3.setGender("Fe-Male");
		c3.setPlanName("Food");
		c3.setPlanStatus("Approved");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(4000.0);
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Dev");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Denied");
		c4.setDeniedRes("property problem");
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Raja");
		c5.setGender("Male");
		c5.setPlanName("Employment");
		c5.setPlanStatus("Terminated");
		c5.setPlanStartDate(LocalDate.now().minusMonths(4));
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenefitAmt(5000.0);
		
		c5.setTerminationDate(LocalDate.now());
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Vamshi");
		c6.setGender("Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Approved");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(500000.0);
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Prabhat");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(500000.0);
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Vamshi");
		c8.setGender("Male");
		c8.setPlanName("Cash");
		c8.setPlanStatus("Approved");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmt(5000.0);
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Vamshi");
		c9.setGender("Male");
		c9.setPlanName("Cash");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(8000.0);
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Kiran");
		c10.setGender("Fe-Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(6000.0);
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Kajal");
		c11.setGender("Fe-Male");
		c11.setPlanName("Cash");
		c11.setPlanStatus("Approved");
		c11.setPlanStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmt(5000.0);
		
	List<CitizenPlan> citi=	Arrays.asList(c1,c2,c3,c4,c5,c6,c8,c9,c10,c11);
		
		repo.saveAll(citi);
		
		
	}
	

}
