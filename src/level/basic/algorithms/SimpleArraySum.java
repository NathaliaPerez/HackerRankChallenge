package level.basic.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author Nathalia.Perez
 */

public class SimpleArraySum {

	static long sum = 0;
	/*
	 * Complete the simpleArraySum function below.
	 */

	static long simpleArraySum(long[] ar) {
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		long[] ar = new long[arCount];
		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			long arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		long result = simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
		scanner.close();
	}
}
