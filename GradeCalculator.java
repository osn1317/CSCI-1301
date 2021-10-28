/*
* GradeCalculator.java
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

public class GradeCalculator {

	public static void main(String[] args) {
		//First, needed vars. will needed to be initialized.
		int Exam1Percent, Exam2Percent, FinalExamPercent, LabsPercent, ProjectsPercent, ParticipationPercent, QuizzesPercent, PercentTotal, Exam1Score, Exam2Score, FinalExamScore, LabsScore, ProjectsScore, ParticipationScore, QuizzesScore;
		double CurrentGrade, WeightsbyScore, TotalKnownWeights, FinalScoreNeeded, FinalScore;
		String DesiredLetterGrade, inputforTruth, CurrentLetterGrade;
		
		//This is the first initial text to be printed to the user.
		System.out.println("Grading Scale:");
		System.out.println("A\t " + "90 - 100\n" + "B\t "+ "80 - 89\n" 
		+ "C\t " + "70 - 79\n" + "D\t " + "60 - 69\n" + "F\t " + "Below 60");
		
		//Next will the first prompt the user will answer too with a char
		System.out.print("What letter grade do you want to acheive for this course?");
		Scanner keyboard = new Scanner(System.in);
		DesiredLetterGrade  = keyboard.nextLine();
		
		//Then to make sure the string is only one letter, an if-else loop will be used 
		if(DesiredLetterGrade.equals("A") || DesiredLetterGrade.equals("B") || DesiredLetterGrade.equals("C") || 
				DesiredLetterGrade.equals("D") || DesiredLetterGrade.equals("F"))
			System.out.println("Enter the percentage weights below.");
		else {
			System.out.println("The input is invaild.");
			System.exit(0);}
			
		//Then, the next inputs to follow will be the ones to be used later to see calculate the grades as needed.
		System.out.print("Exam 1:\t\t");
		Exam1Percent = keyboard.nextInt();
		
		System.out.print("Exam 2:\t\t");
		Exam2Percent = keyboard.nextInt();
		
		System.out.print("Final Exam:\t");
		FinalExamPercent = keyboard.nextInt();
		
		System.out.print("Labs:\t\t");
		LabsPercent = keyboard.nextInt();
		
		System.out.print("Projects:\t");
		ProjectsPercent = keyboard.nextInt();
		
		System.out.print("Participation:\t");
		ParticipationPercent = keyboard.nextInt();
		
		System.out.print("Quizzes:\t");
		QuizzesPercent = keyboard.nextInt();
		
		//The percents will be added accordingly to see if they add up to 100 to continue further into the code or stop it if the total of the percents do not equal 100.
		int CorrectPercentTotal = 100;
		PercentTotal = Exam1Percent + Exam2Percent + FinalExamPercent + LabsPercent + ProjectsPercent + ParticipationPercent + QuizzesPercent;
		if(PercentTotal != CorrectPercentTotal) {
			System.out.println("Weights do not add up to 100, program exiting...");
			System.exit(0);}
		else
			System.out.print("Do you know your exam 1 score?");
		
		//Now to make sure we take only take numeral inputs with yes or y in any case, there will be if-else loops to determine when to do so.
		//It will also ignore anything else and move to the next scenarios if there is anything else answered instead of yes or y in any case.
		inputforTruth = keyboard.next();
		if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
			System.out.print("Score received on exam 1:");
			Exam1Score = keyboard.nextInt();
		
			System.out.print("Do you know your exam 2 score?");
			inputforTruth = keyboard.next();
			if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
				System.out.print("Score received on exam 2:");
				Exam2Score = keyboard.nextInt();
			
				System.out.print("Do you know your final exam score?");
				inputforTruth = keyboard.next();
				if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
					System.out.print("Score received on final exam:");
					FinalExamScore = keyboard.nextInt();
		}
				else {
					FinalExamScore = 0;
					FinalExamPercent = 0;
				}
			}
			else {
				Exam2Score = 0;
				FinalExamScore = 0;
				Exam2Percent = 0;
				FinalExamPercent = 0;
			}
}
		else {
			Exam1Score = 0;
			Exam2Score = 0;
			FinalExamScore = 0;
			Exam1Percent = 0;
			Exam2Percent = 0;
			FinalExamPercent = 0;
		}
		System.out.print("Do you know your lab average?");
		inputforTruth = keyboard.next();
		if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
			System.out.print("Average lab grade:");
			LabsScore = keyboard.nextInt();
		}
		else {
			LabsScore = 0;
			LabsPercent = 0;
		}
		
		System.out.print("Do you know your project average?");
		inputforTruth = keyboard.next();
		if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
			System.out.print("Average project grade:");
			ProjectsScore = keyboard.nextInt();
		}
		else {
			ProjectsScore = 0;
			ProjectsPercent = 0;
		}
		
		System.out.print("Do you know your participation average?");
		inputforTruth = keyboard.next();
		if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
			System.out.print("Average participation grade:");
			ParticipationScore = keyboard.nextInt();
		}
		else {
			ParticipationScore = 0;
			ParticipationPercent = 0;
		}
		
		System.out.print("Do you know your quiz average?");
		inputforTruth = keyboard.next();
		if(inputforTruth.equalsIgnoreCase("yes") || inputforTruth.equalsIgnoreCase("y")) {
			System.out.print("Average quiz grade:");
			QuizzesScore = keyboard.nextInt();
		}
		else {
			QuizzesScore = 0;
			QuizzesPercent = 0;
		}
		
		keyboard.close();
		
		//Now, an algorithm will be set to solve for the current grade that is calculated.
		//Note that necessary conversions will be made to ensure that the output will result in a double and not a integer.
		WeightsbyScore = ((Exam1Percent * Exam1Score) + (Exam2Percent * Exam2Score) + (FinalExamPercent * FinalExamScore) + (LabsPercent * LabsScore) + (ProjectsPercent * ProjectsScore) + (ParticipationPercent * ParticipationScore) + (QuizzesPercent * QuizzesScore));
		TotalKnownWeights = Exam1Percent + Exam2Percent + FinalExamPercent + LabsPercent + ProjectsPercent + ParticipationPercent + QuizzesPercent;
		CurrentGrade = ((WeightsbyScore) / (TotalKnownWeights));
		
		//To then establish and print out a letter grade for the current grade, an if-else loop will be used.
		if (CurrentGrade >= 90) 
			CurrentLetterGrade = "A";
		else if (CurrentGrade < 90 && CurrentGrade >= 80)
			CurrentLetterGrade = "B";
		else if (CurrentGrade < 80 && CurrentGrade >= 70)
			CurrentLetterGrade = "C";
		else if (CurrentGrade < 70 && CurrentGrade >= 60)
			CurrentLetterGrade = "D";
		else
			CurrentLetterGrade = "F";
		
		//Then, print current grade and grade level properly.
		System.out.printf("Current grade score:%.2f " + "\n" , CurrentGrade);
		System.out.println("Your current letter grade:" + CurrentLetterGrade);
		
		//In order to figure out if the user already has grade they wanted, an if-else loop will be used to determine doing so.
		if (DesiredLetterGrade.equals("A"))
			FinalScore = 90;
		else if (DesiredLetterGrade.equals("B"))
			FinalScore = 80;
		else if (DesiredLetterGrade.equals("C"))
			FinalScore = 70;
		else if (DesiredLetterGrade.equals("D"))
			FinalScore = 60;
		else
			FinalScore = 0;
		
		//Print an extra statement if needed to determine if the user already has the letter grade they desire.
		if (CurrentGrade >= FinalScore && TotalKnownWeights == 100) {
			System.out.println("Congratulations! You received the " + DesiredLetterGrade + " that you wanted!");
			System.exit(0);
		}
		else if (CurrentGrade >= FinalScore && TotalKnownWeights != 100) {
			System.out.println("You will receive at least a grade of " + DesiredLetterGrade);
			System.exit(0);
		}
		//If the previous if statement was not satisfied, further steps must be taken to see if and what the user must need to get their desired grade.
		FinalScoreNeeded = (100 * FinalScore - WeightsbyScore) / (100 - TotalKnownWeights);
		
		//Then to see if the users goal is achievable, an if-else loop will be used.
		if (FinalScoreNeeded <= 100) {
			System.out.printf("In order to recieve a grade of " + DesiredLetterGrade + ",\n" 
					+ "you need to score an average greater than\n" + "or equal to %.2f" + " in the rest of the grade items.", FinalScoreNeeded);
		}
		else {
			System.out.print("Unfortunatley, a grade of " + DesiredLetterGrade + " is not possible.");
		}
			
	}

}
