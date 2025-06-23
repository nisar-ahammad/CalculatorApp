package com.app.calculator;


// Class to perform division 
 public class Division {
	 
	//Method to divide two numbers and return the result
	    public double calculate(double a, double b) {
	        if (b == 0) {
	            System.out.println(" Cannot divide by zero.");
	            return 0;
	        }
	        return a / b; //divide the two input numbers a with b
	    }
	}


