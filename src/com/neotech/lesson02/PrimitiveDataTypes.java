package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		//Data Type          Name/Identifier         Operator(=)         Value
        
		//Let's define an age variable 
		byte age = 30;
		
		//This cause a compiler error-the value is too big for byte
		//byte age1 = 128;
		
		short citiesCount =  15000;
		
		System.out.println(age);
		System.out.println(citiesCount);
        		
        int var1 = 5;	 //It works but with a big container for a small value
        
        //How can we decide which data type to use?
        	// -> Thing about the possible ranges you will have
        
        long var2 = 1000000000000000000L; //We can use lower or uppercase L
        
        System.out.println(var1);
        System.out.println(var2);
        
        //How to use decimal numbers
        double var3 = 45.25; //45.25 is a literal double
        float var4 = 45.25F;	//We can use lower or uppercase F
        // double is stored in a bigger box, float in a smaller box 
        
        System.out.println(var3);
        System.out.println(var4);
        
        char dollar = '$';
        char a = '1';
        char space = ' ';
        
        //boolean is either true or false
        boolean pass = true;
        
        System.out.println(dollar);
        System.out.println(a);
        System.out.println(space);
        System.out.println(pass);        
        
        
        		
        		
	}

}
