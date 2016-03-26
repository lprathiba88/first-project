import java.util.Scanner;
/**
 *   File Name: NumberComparison.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * NumberComparison //ADDD (description of class)
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
public class NumberComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer number:");
		int num = Integer.parseInt(scanner.nextLine());

		if (num > 10)
			System.out.println("Number is greater than 10");

		else if (num < 10)
			System.out.println("Number is smaller than 10");
		else
			System.out.println("Number is equal to 10");

	}

}
