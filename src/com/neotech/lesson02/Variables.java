package com.neotech.lesson02;

public class Variables {

	public static void main(String[] args) {
		
		//Data Type         Name/Identifier            Operator          Value
		int                 someNumber                 =                 15;
		
		//Can I display a literal integer? -> Yes
		System.out.println(15);//This is an int literal
		System.out.println("15"); //This is a string literal
		
		//If i want to display/use someNumber, I use it directly by it's name
		System.out.println(someNumber); //This is a variable defined value
		
		//This will cause a compiler error -> var is not defined as a variable
		//System.out.println(var); //var doesn't exist in my code
									//That means it's not defined/declared and assigned a value
		

	}

}
