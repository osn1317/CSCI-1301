/*
* StarGraph.java
* Author: Owen Na
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
*/

import java.util.Scanner;
import java.lang.Math;

public class StarGraph {
	
	public static void main(String[] args) {
		
		//Initialize variables
		double X_Increment, X_min1 = 0, X_Values;
		int AmountInArray = 0, StarAmount = 0;
		String Star = "*";
		
		//Prompt first input text, used an if-else statement to see if the requirement for a minimum amount of x-values is correct.
		System.out.print("Please enter the number of x values to process: ");
		Scanner keyboard = new Scanner(System.in);
		AmountInArray = keyboard.nextInt();
		
		if (AmountInArray > 0) {
			System.out.print("Enter a minimum value for x: ");
			X_min1 = keyboard.nextDouble();
		}
		else {
			System.out.print("The number of x values must be an interger greater than 0.");
			System.exit(0);
		}
		
		
		//Prompt second input text, used just an if statement to see if the requirement for a minimum x-increment is correct.
		System.out.print("Enter the amount to increment x: ");
		X_Increment = keyboard.nextDouble();
		if (X_Increment <= 0) {
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		keyboard.close();
		
		//Identified arrays and used a for loop to output the x and y values produced from earlier user input. 
		System.out.print("Values");
		double[] X_Values2 = new double[AmountInArray];
		double[] Y_Values2 = new double[AmountInArray];
		for(int i = 0; i < AmountInArray; i++) {
			X_Values = (X_Increment * i) + X_min1;
			double Y_Values = 20 * Math.abs(Math.sin(X_Values));
			Y_Values2[i] = Y_Values;
			X_Values2[i] = X_Values;
			System.out.printf("\nx:%.3f" + ", y:%.3f", X_Values, Y_Values);
		}
		
		//After storing the values in the arrays, I printed the amount of stars needed for each index in the array and moved to the next index the print the next amount until the whole array is printed out in the format of Stars.
		System.out.println("\n");
		System.out.println("Graph");
		for(int j = 0; j < AmountInArray; j++) {
			System.out.print(":");
			for (StarAmount = 0; StarAmount < Math.floor(Y_Values2[j]); StarAmount++) {
			System.out.print(Star);
		}
			System.out.println("");
		}
				
			}
		}
		
			
		
		
		
		
	



