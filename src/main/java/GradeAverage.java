import java.util.Scanner;

/**
 *   File Name: GradeAverage.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * GradeAverage //ADDD (description of class)
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
public class GradeAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		float average = 0.0f;
		int total = 0;

		for (int i = 1; i < 5; i++) {

			System.out.println("Please enter grade value for course" + i + ":");
			int num = Integer.parseInt(scanner.nextLine());
			total = total + num;
			average = total / i;
		}

		System.out.println("The average is: " + average);
	}

}
