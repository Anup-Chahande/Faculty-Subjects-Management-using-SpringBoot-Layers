package com.Entity;

public class Subjects {
	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	int subjectid;
	String subjectname;

	public Subjects(int subjectid, String subjectname) {
		super();
		this.subjectid = subjectid;
		this.subjectname = subjectname;
	}

	@Override
	public String toString() {
		return "Subjects [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}
}
