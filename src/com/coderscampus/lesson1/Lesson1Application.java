package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSci;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantamPhysicsTeacher;

public class Lesson1Application {
	
	// Access Modifiers in Java are: public, protected, package, private
	// protected modifiers refer to inheritance 
	public static void main(String[] args) {
		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		System.out.println("----");
		
		Teacher physicsTeacher = new PhysicsTeacher();
		
		//PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		((PhysicsTeacher)physicsTeacher).teach("BoogieScholfield");
	    //castedPhysicsTeacher.teach("BoogieScholfield");
		((PhysicsTeacher)physicsTeacher).mrkPapers();
		
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
