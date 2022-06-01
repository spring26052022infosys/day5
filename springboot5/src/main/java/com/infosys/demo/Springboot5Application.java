package com.infosys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.demo.entity.Student;
import com.infosys.demo.repository.StudentRepository;

@SpringBootApplication
public class Springboot5Application implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	 
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot5Application.class, args);
	   
		 		   		  
	 
	
	}


	@Override
	public void run(String... args) throws Exception {
		 Student student=new Student();
		 student.setRoll(10);
		 student.setName("Ram");
		 student.setMarks(100);
		 studentRepository.save(student);
		
	}

}
