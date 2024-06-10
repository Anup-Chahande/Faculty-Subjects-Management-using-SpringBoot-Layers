package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.Entity.Faculty;
import com.Entity.Subjects;
@Repository

public class Facultysubjectdao {

	public ArrayList<Faculty> allsubjects() {
		ArrayList<Subjects>sub1 = new ArrayList<>();
		sub1.add(new Subjects(1,"java"));
		sub1.add(new Subjects(2,"C"));
		
		ArrayList<Subjects>sub2 = new ArrayList<>();
		sub2.add(new Subjects(1,"Angular"));
		sub2.add(new Subjects(2,"React"));

		Faculty f1 = new Faculty(1,"Anup",5,sub1);		
		Faculty f2 = new Faculty(2,"Sagar",30,sub2);		

		ArrayList<Faculty> allfacsubjects = new ArrayList<>();
		allfacsubjects.add(f1);
		allfacsubjects.add(f2);
		
		return allfacsubjects;
		
	}
	
	
	
}
