package com.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Faculty;
import com.Entity.Subjects;
import com.dao.Facultysubjectdao;

@Service
public class Fac_sub_Service {
	@Autowired
	Facultysubjectdao allsfacsub;

	public ArrayList<String> allsubjectsnames() {

		ArrayList<Faculty> allfacwithsub = allsfacsub.allsubjects();
		ArrayList<String> alsub = new ArrayList<>();
		for (Faculty allinfo : allfacwithsub) {
			List<Subjects> lsub = allinfo.getSubjects();
			for (Subjects allsub : lsub) {
				alsub.add(allsub.getSubjectname());

			}

		}
		return alsub;

	}

//	public ArrayList<Faculty> highestExp() {
//		ArrayList<Faculty> allfacwithsub = allsfacsub.allsubjects();
//		ArrayList<Faculty> experience = new ArrayList<>();
//		for (Faculty facsub : allfacwithsub) {
//			for (Faculty facc : allfacwithsub) {
//				if (facsub.getFacExperience() > facc.getFacExperience()) {
//
//					experience.add(facsub);
//
//				}
//
//			}
//		}
//		return experience;
//
//	}
	
	
	public ArrayList<String> highestExp() {
		ArrayList<Faculty> allfacwithsub = allsfacsub.allsubjects();
		ArrayList<String> experience = new ArrayList<>();
		for (Faculty facsub : allfacwithsub) {
			for (Faculty facc : allfacwithsub) {
				if (facsub.getFacExperience() > facc.getFacExperience()) {

					experience.add(facsub.getFacname());

				}

			}
		}
		return experience;
}}