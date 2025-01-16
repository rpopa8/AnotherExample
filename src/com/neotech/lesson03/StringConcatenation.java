package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		// + operator: concatenates (joins) Strings
		System.out.println(" Hello " + " - " + " World!");
		
		String language = "Python";
		
		System.out.println("I love Java!");
		System.out.println("I love " + language + "!");
		
		
		String s1 = "I love";
		String s2 = "programming";
		
		System.out.println(s1 + " " + language + " " + s2);
		//I love Python programming
		// Quotes and + to add space
		
		//Spacing in String
		System.out.println("Sevim");
		System.out.println("                    Sevim"); //this space matter bc it's withing the double quotes
		System.out.println(                    "Sevim"); //this space doen't matter (outside of "")
		
		
		//String + number/integer
		System.out.println("Why is everyone scared of number " + 13);  //String + number -> String //they are concatenated->joined together
		
		String s3 = "I am " + 2;
		System.out.println(s3); // I am 2
		
		String s4 = s3 + 5;
		System.out.println(s4);
		
		System.out.println("I have " + 2 + 2 + " cats!");
		//Step 1: I have + 2 -->? I have 2
		//Step 2: I have 2 + --> I have 22
		//Step 3: I have 22 + cats! --> I have 22 cats!
		
		System.out.println("I have " + (2 + 2) + " cats!");
		//Step 1: 2 + 2 -->4
		//Step 2: I have + 4 --> I have 4
		//Step 3: I have 4 + cats! --> I have 4 cats!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
