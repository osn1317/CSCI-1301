/*
* ClassifyMessage.java
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

//import necessary packages.
import java.util.Scanner;

public class ClassifyMessage {

	//Don't forget the enumeration required for the lab
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		//Identify required variables that will later need to be initialized.
		double latitude, longitude;
		String payload, catString;
		boolean isInRange;
		MessageCategory category;
		
		//Set geographic boundaries as double variables to determine if user input will be within range.
		double south, north, west, east;
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
		//Print out input prompt for user to respond to and for the identified variables to be initialed.
		System.out.println("Please enter a formatted message: ");
		Scanner keyboard = new Scanner(System.in);
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		catString = catString.trim();
		payload = payload.trim();
		keyboard.close();
		
		//by creating a multi-branch if-else statement, the input that equates to catString can now be printed out later as the output after Category  
		if((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
			category = MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if(catString.equals("offer"))
			category = MessageCategory.OFFER;
		else if((catString.equalsIgnoreCase("structure") || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo") || (catString.equalsIgnoreCase("evac")))))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;			
		
		//with this if-else statement, it is to make sure that the coordinates of the input are within the range. If not, it will produce an output of false.
		if((latitude >= south) && (latitude <= north) 
			&& (longitude >= west) && (longitude <= east))
			isInRange = true;
		else
			isInRange = false;
		
		//finally, print out the outputs wanted properly, use printf if needed.
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t "+ payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.printf("Longitude:\t %-1s" + "\n", longitude);
		System.out.printf("In Range:\t %1s" , isInRange);
	}

}
