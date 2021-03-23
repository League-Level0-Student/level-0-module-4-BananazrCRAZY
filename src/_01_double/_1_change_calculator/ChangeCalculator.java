package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {
	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nic = JOptionPane.showInputDialog("Number of Nickels U Have.");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int numNic = Integer.parseInt(nic);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("Number of Dimes U Have.");
		int numDime= Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("Number of Quarters U Have.");
		int numQ =Integer.parseInt(q);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double totIn$ = (numNic * .05) + (numQ * .25) + (numDime * .10);
		int totInCents = (int) (totIn$ * 100);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "Total in dollars " + totIn$);
		JOptionPane.showMessageDialog(null, "Total in cents " + totInCents);
	}
}

