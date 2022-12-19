# Student Management System

## Introduction
This project has implemented all the crud operations in a simple way with H2 embedded database, custom exceptions and tests for controller class and service class.

## Features of this Project
- Save
- Show all
- Find by ID
- Update by ID
- Delete by ID

## Environment
- Eclipse IDE
- Java 11
- Spring
- Spring initializr
- H2 Embedded Database

## Operating Instructions
- Download source code and import into your code editor (Eclipse, IntelliJ..).
- The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies
- If there are no errors, run program.
- Use [Postman](https://www.postman.com) to check app or use tests.

## Testing
### URL : http://localhost:8080/v1/student + 
- ## POST METHOD
- ### /add
Add student with this in body: <br/>
{ <br/>
    "name": "Ram", <br/>
    "gradeId": "1", <br/>
    "mobileNo": "+971 50 761 7865", <br/>
    "schoolName": "chaitanya", <br/>
}
- ## GET METHOD
- ### /all
List all students from DB.

- ### /find/{id}
Find student in DB by ID.

- ## PUT METHOD
- ### /update/{id}
Update student with ID. <br/>
Add data in the body like saving student but you don't need to input all fields. <br/>
Input only fields that you want to change.

- ## DELETE METHOD
- ### /delete/{id}
Delete student with ID.

