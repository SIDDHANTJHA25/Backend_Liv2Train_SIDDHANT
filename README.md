# Backend_Liv2Train_SIDDHANT
It is based on spring MVC ,Spring Boot ,JPA,Hibernate

# It consist of Five packages:

# 1.com.trainingcentre:- In this package there is main class TrainingcentreApplication which is executed first when application is started

# 2.com.trainingcentre.controller:-In this package there is controller class MyController which consist of three methods.
  1.public List<Training> home() :- This method is mapped by @GetMapping("/getTrainingCenter") when Get method is called with /getTrainingCenter link then this method return all the database enteries of training with the help of JpaRepsitory method findAll().
  
  a)If database is empty then it return empty list:
  
 ![Empty](https://user-images.githubusercontent.com/66818761/85323002-e5d97b80-b4e4-11ea-8a36-765153b0819e.png)
 
  b)If database contains enteries then it will return all the enteries.
  
 ![final](https://user-images.githubusercontent.com/66818761/85323028-effb7a00-b4e4-11ea-8ce3-36617b1abc5a.png)
