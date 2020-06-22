package com.trainingcentre.controller;


import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainingcentre.dao.TrainingDao;
import com.trainingcentre.entity.Training;


@RestController
public class MyController {
	
	
	
	
	@Autowired
    private TrainingDao trainingRepository;

	//Get request for getting/fetching all the Training center details present in database
	@GetMapping("/getTrainingCenter")
	public List<Training> home() {
		
        return trainingRepository.findAll();
       
	}
	
	
	//Filter the database and return only those training centers details which is given by user in the link with get request

	@GetMapping("/getTrainingCenter/{centername}")
    public Training center(@PathVariable String centername) {
		
        return trainingRepository.findById(centername).get();
	}
	
	//Post request for saving details of training centers in the database 
	@PostMapping(path="/addTrainingcenter")
	public Training addCentre(@Valid @RequestBody Training ts){
		
		// Finding the epoch time
		
		long epochTime = 0;                                              
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat crunchifyFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");	
		String currentTime = crunchifyFormat.format(today);
		
		try {
			Date date = crunchifyFormat.parse(currentTime);
			 epochTime = date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		// the epoch time is system generated and not fill by user and other values fill by user and save it in the database
		
		Training  t=new Training(ts.getCentername(),ts.getCentercode(),ts.getAddress(),ts.getStudentcapacity(),ts.getCourseOffered(),epochTime,ts.getContactemail(),ts.getContactphone());
		trainingRepository.save(t); 
		return t;
		
	}

}
