/*
* NetPay.java
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

public class NetPay {
	
	public static void main(String[] args) {
		//first, we need to recognize the initial variables and their values.
		int hoursPerweek;
		double FEDERAL_TAX_PERCENT, STATE_PERCENT_TAX, SOCIAL_SECURITY_PERCENT, MEDICARE_PERCENT, PAY_PER_HOUR;
		
		FEDERAL_TAX_PERCENT = 10.00;
		STATE_PERCENT_TAX = 4.5;
		SOCIAL_SECURITY_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		
	//next, input the proper amount of hours for the week.
	System.out.print("Hours Per Week:\t\t ");
	Scanner keyboard = new Scanner(System.in);
	hoursPerweek = keyboard.nextInt();

	
	//determine equations to calculate necessary outputs.
	double GrossPayment = PAY_PER_HOUR * hoursPerweek;
	double FederalDeduction = GrossPayment * (.01 * FEDERAL_TAX_PERCENT);
	double StateDeduction = GrossPayment * (STATE_PERCENT_TAX / 100);
	double SocialSecurityDeduction = GrossPayment * (.01 * SOCIAL_SECURITY_PERCENT);
	double MedicareDeduction = GrossPayment * (.01 * MEDICARE_PERCENT);
	double DeductionTotal = FederalDeduction + StateDeduction + SocialSecurityDeduction + MedicareDeduction;
	
	//finally, set up output statements with proper spacing. 
	System.out.println("Gross Pay:\t\t " + GrossPayment);
	System.out.println("Net Pay:\t\t " + (GrossPayment - DeductionTotal));
	System.out.println("");
	
	System.out.println("Deductions:");
	System.out.println("Federal:\t\t " + FederalDeduction);
	System.out.println("State:\t\t\t " + Math.round(StateDeduction * 100.0) / 100.0);
	System.out.println("Social Security:\t " + SocialSecurityDeduction);
	System.out.println("Medicare:\t\t " + MedicareDeduction);
	
	
	}

}