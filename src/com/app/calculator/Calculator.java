package com.app.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


//Main class which handles user interaction and calls other operation classes
public class Calculator {

	//Main method where the execution starts
	public static void main(String[] args) {
    
		
		//To take input from the users
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Welcome to Calculator App");
		 
	
		 boolean running = true;
		 while (running) {
			 try {
		       System.out.println("\nChoose Operation:");
		       System.out.println("1. Addition");
		       System.out.println("2. Subtraction");
		       System.out.println("3. Multiplication");
		       System.out.println("4. Division");
		       System.out.println("5. Exit");
		       System.out.print("Enter your choice (1–5): ");
		             int choice = sc.nextInt();

		             if (choice == 5) {
		                 System.out.println("Exiting Calculator. Thank you!");
		                 break;
		             }
                     
		             // Take two numbers as input from user
		             System.out.print("Enter first number: ");
		             double num1 = sc.nextDouble();

		             System.out.print("Enter second number: ");
		             double num2 = sc.nextDouble();

		             //To store the result after arithmetic calculation 
		             double result = 0;

		             //Call the correct class based on the user's choice
		             switch (choice) {
		                 case 1:
		                	//Directly calling method with class name(anonymous object) for one time use
		                     result = new Addition().calculate(num1, num2);
		                     break;
		                 case 2:
		                     result = new Subtraction().calculate(num1, num2);
		                     break;
		                 case 3:
		                     result = new Multiplication().calculate(num1, num2);
		                     break;
		                 case 4:
		                     result = new Division().calculate(num1, num2);
		                     break;
		                 default:
		                     System.out.println("Invalid choice. Try again.");
		                     continue;
		             }

		             // Print result
		             System.out.println("Result: " + result);
		         }
			 catch(InputMismatchException e)
			 {
				System.out.println("Invalid input! Please enter numbers only.");
				sc.nextLine();
			 }
		 }         
		         sc.close();
		         System.out.println("Scanner is closed"); //  scanner resource is now closed
		     
	     }
	}


