package com.trainingcentre;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TrainingcentreApplication {
	
	@Autowired

	public static void main(String[] args){
		SpringApplication.run(TrainingcentreApplication.class, args);
		
	}

	
}
