package com.coderscampus.lesson1;

public class PhysicsTeacher extends Teacher {
	
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
	@Override
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}
	
	/*
	 * @Override public void teach (String teacherName) {
	 * System.out.println("I'm a physics teacher called " + teacherName +
	 * " and I'm now teaching physics"); }
	 */
	
}
