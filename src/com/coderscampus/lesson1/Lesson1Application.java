package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {
		Teacher physicsTeacher = new PhysicsTeacher();
		
		PhysicsTeacher phyTecher = (PhysicsTeacher)physicsTeacher;
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
	    phyTecher.teach("BoogieScholfield");
	    System.out.println("-----");
	    
		CompSci compSci = new CompSci();
		System.out.println(compSci.getClasses());
		System.out.println(compSci.getLevelOfEducation());
		compSci.teach(33);
		System.out.println("----");
		
		QuantamPhysicsTeacher quantamPhysicsTeacher = new QuantamPhysicsTeacher();
		System.out.println(quantamPhysicsTeacher.getClasses());
		System.out.println(quantamPhysicsTeacher.getLevelOfEducation());
		quantamPhysicsTeacher.teach();
		System.out.println("----");
	}

}
