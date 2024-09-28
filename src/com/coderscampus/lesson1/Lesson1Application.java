package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {
		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
	
		CompSci compSci = new CompSci();
		
		System.out.println(compSci.getClasses());
		System.out.println(compSci.getLevelOfEducation());

	}

}
