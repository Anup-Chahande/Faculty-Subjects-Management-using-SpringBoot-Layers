package com.Entity;

import java.util.List;

public class Faculty {
	int facid;
	String facname;
	int facExperience;
	List<Subjects> Subjects;

	public Faculty(int facid, String facname, int facExperience, List<com.Entity.Subjects> subjects) {
		super();
		this.facid = facid;
		this.facname = facname;
		this.facExperience = facExperience;
		Subjects = subjects;
	}

	public Faculty() {
		super();
	}

	public int getFacid() {
		return facid;
	}

	public void setFacid(int facid) {
		this.facid = facid;
	}

	public String getFacname() {
		return facname;
	}

	public void setFacname(String facname) {
		this.facname = facname;
	}

	public int getFacExperience() {
		return facExperience;
	}

	public void setFacExperience(int facExperience) {
		this.facExperience = facExperience;
	}

	public List<Subjects> getSubjects() {
		return Subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		Subjects = subjects;
	}

	@Override
	public String toString() {
		return "Faculty [facid=" + facid + ", facname=" + facname + ", facExperience=" + facExperience + ", Subjects="
				+ Subjects + "]";
	}

}
