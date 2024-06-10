package com.contoler;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Faculty;
import com.Entity.Subjects;
import com.Service.Fac_sub_Service;

@RestController
public class Fac_sub_controller {
	@Autowired
	Fac_sub_Service allsub;

	@GetMapping("allsubnames")
	ArrayList<String> getallsubject() {

		return allsub.allsubjectsnames();
	}
	
	
	@GetMapping("highexp")
	 ArrayList<String> highexperience() {

		return allsub.highestExp();
	}

}
