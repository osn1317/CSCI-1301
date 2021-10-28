/*
* PayoffDebt.java
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

public class PayoffDebt {

	public static void main(String[] args) {
	
		//first, identify initial variables
		double Principal, AnnualIntrestRate, MonthlyPayment;
		
		//second, we let the user input his/her inputs in order to calculate later, complex outputs.  
		System.out.print("Principal:\t\t\t ");
		Scanner keyboard = new Scanner(System.in);
		Principal = keyboard.nextDouble();
		
		System.out.print("Annual Intrest Rate (%):\t ");
		AnnualIntrestRate = keyboard.nextDouble();
		
		System.out.print("Monthly Payment:\t\t ");
		MonthlyPayment = keyboard.nextDouble();
		keyboard.close();
		//now, we identify new variables to insert with the inputs to now find outputs
		int MonthsNeededtoPayOff = (int)Math.ceil((Math.log(MonthlyPayment) - Math.log((MonthlyPayment) - (AnnualIntrestRate / 1200.0) * Principal))
				/ (Math.log((AnnualIntrestRate / 1200.0) + 1.0)));
		double MonthsNeededtoPayOffI = ((Math.log(MonthlyPayment) - Math.log((MonthlyPayment) - (AnnualIntrestRate / 1200.0) * Principal))
				/ (Math.log((AnnualIntrestRate / 1200.0) + 1.0)));	
		System.out.println("Months Needed to Pay Off:\t " + MonthsNeededtoPayOff);
		
		//I created a double variable version of int MonthsNeededtoPayOff in order to use it to calculate Overpayment.
		//I also made another variable called FinalOverpayment to simply have a proper output value to be displayed by the code later. 
		double TotalAmountPaid = MonthsNeededtoPayOff * MonthlyPayment; 
		double TotalIntrestPaid = TotalAmountPaid - Principal;
		double FinalOverpayment = TotalAmountPaid - (MonthlyPayment * MonthsNeededtoPayOffI);
		double Overpayment = FinalOverpayment;
		
		System.out.printf("Total Amount Paid:\t\t $" + "%.2f\n" , TotalAmountPaid);
		System.out.printf("Total Intrest Paid:\t\t $" + "%.2f\n" , TotalIntrestPaid);
		System.out.printf("Overpayment:\t\t\t $" + "%.2f\n" , Overpayment);
		
	}

	}
	
