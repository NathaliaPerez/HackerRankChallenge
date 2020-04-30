package level.basic.algorithms;

import java.util.Scanner;

/*
 * @author Nathalia.Perez
 */

public class DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
		
		int intVariable = 12;
		double doubleVariable = 4.0;
		String strVariable = "is the best place to learn and practice coding!";
		
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		intVariable = scan.nextInt();
		doubleVariable = scan.nextDouble();
		scan.nextLine();
		strVariable = scan.nextLine();

		/* Print the sum of the double variables on a new line. 
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		System.out.println(i + intVariable);
		System.out.println(d + doubleVariable);
		System.out.println(s + strVariable);
		scan.close();
	}
}
