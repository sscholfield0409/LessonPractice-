package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	
	public Teacher () {
		this.classes = "No Classes Assigned";
		this.levelOfEducation = "No Level Of Education Assigned";
	
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getLevelOfEducation() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
	
}
