
/*
* DrawingShapes.java
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

public class DrawingShapes {

	public static void main(String[] args) {

		// Initialize variables
		String UserShape;
		int ShapeLength = 0, ShapeHeight = 0;

		// ask for the input for what shape the user want to display
		System.out.println("Enter a shape: r t h o p");
		Scanner keyboard = new Scanner(System.in);
		UserShape = keyboard.nextLine();

		// make an if statement to see if the user input is viable
		if (!(UserShape.equals("r") || UserShape.equals("t") || UserShape.equals("h") || UserShape.equals("o")
				|| UserShape.equals("p"))) {
			System.out.println("Invalid shape");
			System.out.println("Goodbye!");
			System.exit(0);
		}

		// ask for the input for the length wanted by the user
		System.out.println("Enter a length");
		ShapeLength = keyboard.nextInt();

		// with an if-else statement, make sure the length input is at least 1 and that
		// height is not prompted if any other shape than rectangle
		if (ShapeLength <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		} else if (UserShape.equals("t") || UserShape.equals("h") || UserShape.equals("o") || UserShape.equals("p")) {
			;
		} else {
			System.out.println("Enter a height");
			ShapeHeight = keyboard.nextInt();
			if (ShapeHeight <= 1) {
				System.out.println("Height must be greater than 1");
				System.out.println("Goodbye");
				System.exit(0);
			}
		}
		keyboard.close();

		// print out a rectangle with for loops
		if (UserShape.equals("r")) {
			System.out.println("Below is a " + ShapeLength + " by " + ShapeHeight + " rectangle of *");
			for (int i = 0; i < ShapeHeight; i++) {
				System.out.print("");
				for (int j = 0; j < ShapeLength; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

		// print out a triangle with for loops
		else if (UserShape.equals("t")) {
			System.out.println("Below is a triangle with two side lengths of " + ShapeLength + " *");
			for (int i = 1; i <= ShapeLength; i++) {
				for (int j = i; j < ShapeLength; j++) {
					System.out.print(" ");
				}
				for (int g = 1; g < (i * 2); g++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		// print out a hexagon with for loops if user inputed to output one.
		else if (UserShape.equals("h")) {
			System.out.println("Below is a hexagon with side lenghts of " + ShapeLength + " *");

			// This for loop will print out the top half of stars for the hexagon.
			for (int i = 1, j = ShapeLength, g = 2 * ShapeLength - 1; i < ShapeLength; i++, j--, g++) {
				for (int d = 1; d < 3 * ShapeLength; d++) {
					if (d >= j && d <= g) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println("");
			}

			// This for loop will print the bottom half of the stars for the hexagon.
			for (int i = 0, j = 1, g = 3 * ShapeLength - 2; i < ShapeLength; i++, j++, g--) {
				for (int d = 1; d < 3 * ShapeLength; d++) {
					if (d >= j && d <= g) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println("");
			}
		}
		// print out an octagon with for loops if user inputed to output one.
		else if (UserShape.equals("o")) {
			System.out.println("Below is an octagon with side lengths of " + ShapeLength + " *");

			// This for loop will print out the top half of stars for the octagon
			for (int i = 1, j = ShapeLength, g = 2 * ShapeLength - 1; i < ShapeLength; i++, j--, g++) {
				for (int d = 1; d < 3 * ShapeLength; d++) {
					if (d >= j && d <= g) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println("");
			}

			// This for loop will print out the middle section of stars for the octagon
			for (int i = 1; i < ShapeLength; i++) {
				for (int j = 2; j < ShapeLength * 3; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

			// This for loop will print out the bottom section of stars for the octagon
			for (int i = 0, j = 1, g = 3 * ShapeLength - 2; i < ShapeLength; i++, j++, g--) {
				for (int d = 1; d < 3 * ShapeLength; d++) {
					if (d >= j && d <= g) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println("");
			}
		}
		// Print out a pentagon with for loops if user inputed to output one.
		else if (UserShape.equals("p")) {
			System.out.println("Below is a pentagon with 4 side lengths of " + ShapeLength + " *");

			// This for loop will print out the top section of stars for the pentagon
			for (int i = 1; i <= ShapeLength; i++) {
				for (int j = i; j < ShapeLength; j++) {
					System.out.print(" ");
				}
				for (int d = 1; d < (i * 2); d++) {
					System.out.print("*");
				}
				System.out.println("");
			}

			// This for loop will print out the bottom section of stars for the pentagon.
			for (int i = 1; i < ShapeLength; i++) {
				for (int j = 1; j < ShapeLength * 2; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}

}
