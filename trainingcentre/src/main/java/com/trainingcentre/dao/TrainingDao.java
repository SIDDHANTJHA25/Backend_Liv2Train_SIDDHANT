package com.trainingcentre.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingcentre.entity.Training;


//extending the JpaRepository to create database table and store the value in it using ORM
public interface TrainingDao extends JpaRepository<Training, String>{

}
