package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	
	private void giveARaise () {
		System.out.println("Teacher gets a raise");
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}
	
	public void teach (String teacherName) {
		System.out.println("I'm a teacher called " + teacherName + " and I'm now teaching physics");
	}
	
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
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
