# Backend_Liv2Train_SIDDHANT
It is based on spring MVC ,Spring Boot ,JPA,Hibernate

# It consist of Five packages:

# 1.com.trainingcentre:- In this package there is main class TrainingcentreApplication which is executed first when application is started

# 2.com.trainingcentre.controller:-In this package there is controller class MyController which consist of three methods.
 # 1.public List<Training> home() :- This method is mapped by @GetMapping("/getTrainingCenter") when Get method is called with /getTrainingCenter link then this method return all the database enteries of training with the help of JpaRepsitory method findAll().
  
  a)If database is empty then it return empty list:
  
 ![Empty](https://user-images.githubusercontent.com/66818761/85323002-e5d97b80-b4e4-11ea-8a36-765153b0819e.png)
 
  b)If database contains enteries then it will return all the enteries.
  
 ![final](https://user-images.githubusercontent.com/66818761/85323028-effb7a00-b4e4-11ea-8ce3-36617b1abc5a.png)
  
       2.public Training center(@PathVariable String centername) :-This metod filters information from database,This method is mapped by @GetMapping("/getTrainingCenter/{centername}")when Get method is called with /getTrainingCenter/centername link then this method return single training center information/entry from the database with the help of JpaRepsitory method.
  
  a)writing centername ducait in link then:
  
  ![singleSearch](https://user-images.githubusercontent.com/66818761/85323523-c2630080-b4e5-11ea-83d4-e7498ff07353.png)

  b)writing centername STG in link then:
  
  ![singlesearch1](https://user-images.githubusercontent.com/66818761/85323536-cabb3b80-b4e5-11ea-96ff-38a07f56b656.png)


    3.public Training addCentre(@Valid @RequestBody Training ts):- This method is mapped by @PostMapping(path="/addTrainingcenter") when Post method is called with /addTrainingCenter link then this method save the enteries/training center information in the database using JpaRepository method save().First of all it validate all the field if the field is not proper then it returns message and not saved the information in database and return the response in json.
  
  a)validating centercode:
  
![centerCode(validation_error)](https://user-images.githubusercontent.com/66818761/85324120-e410b780-b4e6-11ea-9789-c3389eadc58c.png)

  b)validating contactphone:
  
![phoneNo(validation_error)](https://user-images.githubusercontent.com/66818761/85324132-ea069880-b4e6-11ea-8d38-9ddbdb049950.png)

  c)validating email:
  
![email(validation_error)](https://user-images.githubusercontent.com/66818761/85324146-eecb4c80-b4e6-11ea-8a68-275ecf0a3aee.png)

  d)If email already present in the database then it not save the post request
  
  If all validation performs successfully then the enteries stored in database
  
  a)Storing centername ducait:
  
  
![afterInsertion](https://user-images.githubusercontent.com/66818761/85324509-99436f80-b4e7-11ea-8488-1650abf03a71.png)


![afterInsertion1](https://user-images.githubusercontent.com/66818761/85324514-9d6f8d00-b4e7-11ea-92b3-ea273cef43a6.png)

  b)Storing centername STG:
  
![afterInsertion2](https://user-images.githubusercontent.com/66818761/85324525-a1031400-b4e7-11ea-91af-ddcf7cd476e8.png)

![afterInsertion3](https://user-images.githubusercontent.com/66818761/85324549-abbda900-b4e7-11ea-969b-15a421375c84.png)


# 3.com.trainingcentre.dao :- This package contains interface TrainingDao which  extends JpaRepository<Training, String> where Training is entity class and String is primary key datatype.The Two tables are created with orm hibernate and jpa:
 1)Training
 2)Course(one-many)
 
 Initially all the enteries in database are null:
 a)Training table.
 
 ![training(table)](https://user-images.githubusercontent.com/66818761/85325111-b462af00-b4e8-11ea-97bc-f16c75f37bc4.png)

 b)Course table.
 
 ![Course(table)](https://user-images.githubusercontent.com/66818761/85325128-ba589000-b4e8-11ea-9578-19d854f5874a.png)
 
 After the insertion with post request all the enteries are saved in database and the tables look like:
 a)Training table.
 
 
![afterTraining(table)](https://user-images.githubusercontent.com/66818761/85325138-c04e7100-b4e8-11ea-85dd-0d2722fe77f4.png)

 b)Course table.
 
![afterCourse(table)](https://user-images.githubusercontent.com/66818761/85325148-c5132500-b4e8-11ea-9679-9a8b5e726c81.png)

 
