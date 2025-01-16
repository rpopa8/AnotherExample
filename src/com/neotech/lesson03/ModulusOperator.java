package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {
		
		
		// modulus operator --> %
		
		int a = 13;
		int b = 5;
		
		int div = a/b; //2
		System.out.println("div --> " + div);

		
		//13    5
		//what is the largest number that's fully divisible by 5?
		//10 / 5 = 2 //3 is the remainder
		
		int remainder = a % b;
		System.out.println("remainder --> " + remainder);
		
		//dividing doubles 
		double d1 = 13;
		double d2 = 5;
		
		double res = d1/d2;
		System.out.println("res --> " + res);
		
		int num1 = 17;  //I have 17 cars
		int num2 = 4;   //I want to split them in 4 --> one car will be left over(remainder)
		
		int rem = num1 % num2;
		System.out.println("rem --> " + rem);
		
		
		
		
		
		
		
		
		
		
		

	}

}
