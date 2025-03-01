package com.danielnaiff.project;

import com.danielnaiff.project.entities.User;
import com.danielnaiff.project.resources.UserResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
//		UserResource u = new UserResource();
//		u.findAll();
	}

}
