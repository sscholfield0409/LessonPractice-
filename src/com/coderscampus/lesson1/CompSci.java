package com.coderscampus.lesson1;

public class CompSci extends Teacher {
	
	public CompSci () {
		System.out.println("Inside the CompSci constructor");
		this.setClasses("COMP 101, COMP 201");
		this.setLevelOfEducation("Masters of Computer Science");
	}

}
