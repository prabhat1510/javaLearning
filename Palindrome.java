/**
 * 
 */
package javaLearning;

/**
 * @author t-Prabhat
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder, sum = 0, temp;
		int number = 454;// It is the number variable to be checked for palindrome

		temp = number;
		while (number > 0) {
			remainder = number % 10; // getting remainder
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
