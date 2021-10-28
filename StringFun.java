/*
* StringFun.java
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

public class StringFun {
	public static void main(String[] args) {
		
		//Initialize needed variables
		int CharacterToDelete;
		String InputText, ActionText;
		String TemporaryText = "";
		char RemovingCharacter, NewCharacter;
		boolean Truth;
		
		//initiate package Scanner to prompt and allow user to create an input.
		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		InputText = keyboard.nextLine();

		//I created a big while loop to contain and run everything while the user doesn't input and form of the word "quit."
		Truth = true;
		while (Truth){
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			ActionText = keyboard.nextLine();
			
			//created the outcome of the quit option to simply end the program once typed in the while loop.
			if(ActionText.equalsIgnoreCase("QUIT")) {
				Truth = false;
				keyboard.close();
			}
			
			//To create a reverse, a for loop is used to output the input backwards.
			else if(ActionText.equalsIgnoreCase("REVERSE")) {
				for(int i = InputText.length() - 1; i >= 0; i--) {
				TemporaryText += InputText.charAt(i);
				}
				System.out.println("The new sentence is: " + TemporaryText);
				InputText = TemporaryText;
				TemporaryText = "";
			}
			
			//To replace the first character, a substring identifies the first character of the user input and replaces it if possible.
			//re-prompts if not possible to replace.
			else if(ActionText.equalsIgnoreCase("REPLACE FIRST")) {
				System.out.println("Enter the character to replace");
				RemovingCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				NewCharacter = keyboard.nextLine().charAt(0);
				boolean DoesNotExist = true;
				for (int i = 0; i < InputText.length(); i++) {
					if (RemovingCharacter == InputText.charAt(i)) { 
						String PartOne = InputText.substring(0, i);
						String PartTwo = InputText.substring(i + 1);
						InputText = PartOne + NewCharacter + PartTwo;
						DoesNotExist = false;
						i = InputText.length();
					}
				}
				
				//Check if letter user wants to replace exists
				if (DoesNotExist) {
					System.out.println("The letter was not found in the word");
				}
				//Update and display original
				else {
					System.out.println("The new sentence is: " + InputText);
				}
			}
			//To replace the last character, two substrings are created and identifies the last character of the user input and replaces it if possible.
			//re-prompts if not possible to replace.
			else if(ActionText.equalsIgnoreCase("REPLACE LAST")) {
				System.out.println("Enter the character to replace");
				RemovingCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the new character");
				NewCharacter = keyboard.nextLine().charAt(0);
				boolean DoesNotExist = true;
				for (int i = InputText.length() - 1; i >= 0; i--) {
					if (RemovingCharacter == InputText.charAt(i)) { 
							String PartOne = InputText.substring(0, i);
							String PartTwo = InputText.substring(i + 1);
							InputText = PartOne + NewCharacter + PartTwo;
							DoesNotExist = false;	
							i = -1;
					}
				}	
				//Check if letter user wants to replace exists
				if (DoesNotExist) {
					System.out.println("The letter was not found in the word");
				}
				//Update and display original
				else {
					System.out.println("The new string is: " + InputText);
				}
			}
			
			//To remove all instances of a character, simply adding two new substrings together that exclude all the RemovingCharacter works
			//re-prompts if not possible to remove all.
			else if(ActionText.equalsIgnoreCase("REMOVE ALL"))	{
				System.out.println("Enter the character to remove");
				RemovingCharacter = keyboard.nextLine().charAt(0); 
				boolean DoesNotExist = true;
				for(int i = InputText.length() - 1; i >= 0; i--) {
					if(RemovingCharacter == InputText.charAt(i)) {
						String PartOne = InputText.substring(0, i);
						String PartTwo = InputText.substring(i + 1);
						TemporaryText = PartOne + PartTwo;
						InputText = TemporaryText;
						TemporaryText = "";
						DoesNotExist = false;
					}
				}
				//Check if letter user wants to remove exists
				if (DoesNotExist) {
					System.out.println("Error: the letter you are trying to remove all does not exist");
				}
				//Update and display original
				else {
					System.out.println("The new string is: " + InputText);
				}
			}

			//To remove a certain character within a string, simply adding two substrings together that exclude the RemovingCharacter works
			//re-prompts if not possible to remove the certain character.
			else if(ActionText.equalsIgnoreCase("REMOVE")) {
				System.out.println("Enter the character to remove");
				RemovingCharacter = keyboard.nextLine().charAt(0);
				System.out.println("Enter the " + RemovingCharacter + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
				CharacterToDelete = keyboard.nextInt();
				boolean DoesNotExist = true;
				keyboard.nextLine();
				int LetterChecker = 0;
				
				for(int i = 0; i < InputText.length(); i++) {
					if (InputText.charAt(i) == RemovingCharacter) {
						LetterChecker++;
						
						if(LetterChecker == CharacterToDelete) {
							String PartOne = InputText.substring(0, i);
							String PartTwo = InputText.substring(i +1);
							TemporaryText = PartOne + PartTwo;
							InputText = TemporaryText;
							TemporaryText = "";
							DoesNotExist = false;
							}
						}
				}
				//Check if letter user wants to remove exists
				if (DoesNotExist) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				//Update and display orginial
				else {
					System.out.println("The new string is: " + InputText);
					
						}		
					}
				}
			}	
		}
	

