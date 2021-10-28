/*
* ParseTheTweet.java
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

public class ParseTheTweet {

	public static void main(String[] args) {
		
		//create scanner input for a string for the program to read.
		System.out.println("Enter a tweet below ");
		Scanner keyboard = new Scanner(System.in);
		String Tweet = keyboard.nextLine();
		keyboard.close();
		
		//defining 5 string variables
		String tweetType, tweetDetail, tweetLocation, tweetLatititude, tweetLongitude;
		
		//defining both a start and end index
		int StartIndex = Tweet.indexOf("#");
		int EndIndex = Tweet.indexOf(";");
		
		//in order for the important information to be printed out, a certain part of the input string will be printed.
		//For this part of the program as well, the substring must be in all caps, thus toUpperCase() is used. 
		tweetType = Tweet.substring(StartIndex + 5 , EndIndex);
		tweetType = tweetType.trim();
		System.out.print("Type:\t\t " + tweetType.toUpperCase());
		
		//To go to the next part of the input stream for important information. 
		//by using EndIndex + 1, it allows the code to now start using information after the first chunk of inputs are finished.
		Tweet = Tweet.substring(EndIndex + 1);
		
		//Reinitialize variables to use for the next section of the string
		StartIndex = Tweet.indexOf("#");
		EndIndex = Tweet.indexOf(";");
		
		//print out and trim properly the next set of outputs
		tweetDetail = Tweet.substring(StartIndex + 5 , EndIndex);
		tweetDetail = tweetDetail.trim();
		System.out.println("\nDetail:\t\t " + tweetDetail);
		
		//this step will be repeated in order to move to next part of important information to print out.
		Tweet = Tweet.substring(EndIndex + 1);
		
		//Reinitialize index variables
		StartIndex = Tweet.indexOf("#");
		EndIndex = Tweet.indexOf(";");
		
		//print and trim tweetLocation properly
		tweetLocation = Tweet.substring(StartIndex + 5, EndIndex);
		tweetLocation = tweetLocation.trim();
		System.out.println("Location:\t " + tweetLocation);
		
		//end and begin reading next chunk of important information of the input from scanner.
		Tweet = Tweet.substring(EndIndex + 1);
		
		//Reinitialize index variables
		StartIndex = Tweet.indexOf("#");
		EndIndex = Tweet.indexOf(";");
		
		//print and trim tweetLatititude properly
		tweetLatititude = Tweet.substring(StartIndex + 5, EndIndex);
		tweetLatititude = tweetLatititude.trim();
		System.out.println("Latititude:\t " + tweetLatititude);
		
		//end and begin reading next chunk of important of information from input scanner
		Tweet = Tweet.substring(EndIndex + 1);
		
		//Reinitialize index variables
		StartIndex = Tweet.indexOf("#");
		EndIndex = Tweet.indexOf(";");
		
		//finally print out the final input and ensure tweetLongitude is also trimmed properly.
		tweetLongitude = Tweet.substring(StartIndex + 5, EndIndex);
		tweetLongitude = tweetLongitude.trim();
		System.out.println("Longitude:\t " + tweetLongitude);
		

		
	}

}
