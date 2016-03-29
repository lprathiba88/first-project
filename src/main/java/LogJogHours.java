import java.util.Scanner;

/**
 *   File Name: LogJogHours.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 28, 2016
 *
 */

/**
 * LogJogHours //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class LogJogHours {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		float numberOfDays;
		float hoursPerDay;
		float totalHours = 0;
		float averageHours;
		String nextJogger = "yes";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Log Your Jogging Hours!");

		do {
			System.out.println("Please enter the registered jogger's name: ");

			name = scanner.nextLine();

			System.out.println("How many days did " + name + " go jogging this week?");
			numberOfDays = Float.parseFloat(scanner.nextLine());

			if (numberOfDays > 0 && numberOfDays < 8) {
				for (int i = 1; i <= numberOfDays; i++) {
					System.out.println("Please enter the number of hours " + name + " jogged on day " + i + ": ");
					hoursPerDay = Float.parseFloat(scanner.nextLine());
					totalHours = totalHours + hoursPerDay;
				}

				System.out.println(name + " logged " + totalHours + " of jogging this week!");

				averageHours = totalHours / numberOfDays;

				if (averageHours < 15) {
					System.out.println(name + " is an amatuer!");
				} else if (averageHours < 41) {
					System.out.println(name + " is efficient!");
				} else {
					System.out.println(name + " is an extremist!");
				}

			} else {
				if (numberOfDays > 7) {
					System.out.println("Incorrect number of days.");
				}
				System.out.println(name + " did not jog this week.");
			}
			System.out.println("Do you want to log the next jogger?");
			nextJogger = scanner.nextLine();

		} while (nextJogger.equalsIgnoreCase("yes"));

		System.out.println("Thank you for using this application! Bye!");

	}

}
