package com.subh.reportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.subh.reportapp.entity.CitizenPlan;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		CitizenPlan c= new CitizenPlan();
		
	}

}
