import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userNum;
		int numSquared;
		int numCubed;
		int i;
		String cont = "y";

		System.out.println("Learn your squares and cubes!");

		while (cont.equalsIgnoreCase("y")) {

			// Get user input

			System.out.println("Enter an integer: ");
			userNum = scnr.nextInt();

			String table = "";
			table += "Number\tSquared\tCubed\n";
			table += "======\t======\t======\n";

			for (i = 1; i <= userNum; i++) {

				numSquared = i * i;
				numCubed = i * i * i;
				table += i + "\t" + numSquared + "\t" + numCubed + "\n";
			}
			System.out.println(table);

			System.out.println("Would you like to continue? y/n");
			cont = scnr.next();

		}
		System.out.println("Ok, bye.");
		scnr.close();
	}

}
