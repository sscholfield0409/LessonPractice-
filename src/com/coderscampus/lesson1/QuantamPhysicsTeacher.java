package com.coderscampus.lesson1;

public class QuantamPhysicsTeacher extends PhysicsTeacher {
	
	public QuantamPhysicsTeacher () {
		System.out.println("Inside the QuantamPhysicsTeacher constructor");
		this.setClasses("QPHY 101, qphy 201");
		this.setLevelOfEducation("PHD");
	}
	
	@Override
	public void teach () {
		System.out.println("I am a quantam physics teacher, and I'm now in a super-position of teaching");
	}

}
