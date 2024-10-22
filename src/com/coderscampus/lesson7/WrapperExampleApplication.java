package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {
		/**
		 * byte   -> Byte
		 * short  -> Short
		 * int	  -> Integer
		 * long   -> Long
		 * float  -> Float
		 * double -> Double
		 * char   -> Character
		 * boolean-> Boolean
		 * 
		 */
		
		int primitiveInt = 9;
		Integer wrapperInt = 9; // auto-boxing- ability to use a non-object value 
		//and assign it into an actual object. 

		primitiveInt = Integer.valueOf(9); // un-boxing. the opposite of auto-boxing. 
		// Integer wrapper class provides more options when using "." like "Integer."
		
		String someNumber = "123";
		String someOtherNumber = "456";
		
		//A safer way to do String comparison to avoid a NullPointerException
		if ("456".equals(someNumber)) {
			
		}
		
		System.out.println(someNumber + someOtherNumber); // This would result
		//in the console outputting "123456" as Strings, instead of adding them
		//like numbers
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));
		//This parsing of the Integers would allow for the numbers
		//to be added as numbers instead of concatenated as Strings 
		Integer anotherIntWrapper = Integer.valueOf(9);
		
		Boolean someBoolean = null;
		
		// A safer way to do a Boolean evaluation to avoid NullPointerExceptions 
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primitive long comparison works");
		}
		
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
		//When comparing object wrapper values, be sure to use .equals() not ==
		if (firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object wrapper Long comparison works");
		}
	}

}
