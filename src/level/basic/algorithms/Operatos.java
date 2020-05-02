package level.basic.algorithms;
import java.util.Scanner;

/*
 * @author Nathalia.Perez
 */

public class Operatos {

	private static final Scanner scanner = new Scanner(System.in);
	private static int totalCost;

	// Complete the solve function below.
	private static int solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = meal_cost * tip_percent / 100;
		double tax = tip_percent * tax_percent / 100;

		return (int) Math.round(meal_cost + tip + tax);
	}
	    
	public static void main(String[] args) {
		double meal_cost = 12;
		meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = 20;
		tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = 8;
		tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		totalCost = solve(meal_cost, tip_percent, tax_percent);

		System.out.println(totalCost);
		scanner.close();
	}
}
