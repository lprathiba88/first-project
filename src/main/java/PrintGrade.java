import java.util.Scanner;

/**
 *
 *   File Name: PrintGrade.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * PrintGrade //ADDD (description of class)
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
public class PrintGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a grade value:");
		int num = Integer.parseInt(scanner.nextLine());

		if (num < 25) {
			System.out.println("Grade D: Poor");
		}

		else if (num < 50) {
			System.out.println("Grade B: Fair");
		}

		else if (num < 75) {
			System.out.println("Grade C: Good");
		}

		else if (num < 100) {
			System.out.println("Grade D: Excellent");
		}

		else if (num < 0 || num > 100) {
			System.out.println("Invalid number");
		}

	}

}
