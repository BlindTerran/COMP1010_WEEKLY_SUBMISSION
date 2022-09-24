package practicePackage._04_recursion.attempts;

public class Stage2 {


	/**
	 * 
	 * @param n
	 * @return the sum of the even digits in n
	 */
	public static int sumEvenDigits(int n) {
		if (n == 0)
			return 0;
		int remainder = n%10;
		if (remainder%2 == 0) {
			if (remainder < 0) {
				remainder = -remainder;
			}
			int contribution = remainder;
			int subCallResult = sumEvenDigits(n/10);
			int result = contribution + subCallResult;
			return result;
		} else {
			return sumEvenDigits(n/10);
		}
	}

	/**
	 * 
	 * @param n
	 * @param d: digit to count, d is between 0 and 9 (inclusive on both sides)
	 * @return the number of times digit d exists in integer n
	 * IMPORTANT countDigit(0, d) for any d should return 0
	 * 
	 * countDigit(10074, 0) = 2
	 * countDigit(38, 8) = 1
	 * countDigit(888, 8) = 3
	 * countDigit(12345, 6) = 0
	 * countDigit(0, 0) = 0 (NOT 1)
	 */
	public static int countDigit(int n, int d) {
		if (n == 0) 
			return 0;
		int target = n%10;
		if (target < 0) 
			target = -target;
		if (target == d) {
			int contribution = 1;
			int reduced = n/10;
			int subCallResult = countDigit(reduced, d);
			int result = contribution + subCallResult;
			return result;
		} else {
			return countDigit(n/10, d);
		}
	}

	/**
	 * 
	 * @param a
	 * @param b (assume b is more than or equal to 1)
	 * @return the product of a and b using ONLY addition operator (+).
	 * you cannot use the multiplication operator (*) 
	 * or the Math library
	 * HINT: multiplication is repeated addition
	 */
	public static int product(int a, int b) {
		if (b == 0)
			return 0;
		int contribution = a;
		int subCallResult = product(a, b-1);
		int result = contribution + subCallResult;
		return result;
	}

	/**
	 * tribonacci sequence is a variation of fibonacci sequence where the first three terms
	 * are 0, 0 and 1 and every subsequent term is the sum of the THREE terms
	 * before it
	 * @param n
	 * @return term at index n in tribonacci sequence
	 * 
	 * FOR EXAMPLE,
	 * tribonacci(0) = 0
	 * tribonacci(1) = 0
	 * tribonacci(2) = 1
	 * tribonacci(3) = 1
	 * tribonacci(4) = 2
	 * tribonacci(5) = 4
	 * tribonacci(6) = 7
	 * tribonacci(7) = 13
	 */
	public static int tribonacci(int n) {
		if (n < 2)
			return 0;
		if (n == 2)
			return 1;
		return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
	}

	/**
	 * 
	 * @param n
	 * @return the smallest digit in the value passed
	 */
	public static int smallestDigit(int n) {
		if (n < 0)
			n = -n;
		//terminal case: when n has one digit remains
		if (n < 10)
			return n;
		int remainder = n%10;
		int subCallResult = smallestDigit(n/10);
		if (remainder < subCallResult) {
			return remainder;
		} else {
			return subCallResult;
		}
	}

	/**
	 * 
	 * @param n
	 * @return the smallest even digit in the value passed
	 * return 0 if the number doesn't have any even digits
	 */
	public static int smallestEvenDigit(int n) {
		if (n < 0)
			n = -n;
		if (n == 0)
			return 10;
		if ((n%10)%2 == 0) {
			//the last digit is even 
			int remainder = n%10;
			int subCallResult = smallestEvenDigit(n/10);
			if (remainder < subCallResult) {
				return remainder;
			} else {
				return subCallResult;
			}
		} else {
			return smallestEvenDigit(n/10);
		}
	}

	/**
	 * 
	 * @param n
	 * @return the location of the highest even digit in the value passed.
	 * 1 if the highest even digit is the least significant digit,
	 * 2 if the highest even digit is the second-least significant digit, and so on, 
	 * return 0 if the number doesn't have any even digits
	 */
	public static int highestEvenDigitLocation(int n) {
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return the location of the smallest digit in the value passed.
	 * 1 if the smallest digit is the least significant digit,
	 * 2 if the smallest digit is the second-least significant digit, and so on, 
	 * return 0 if the number is 0.
	 */
	public static int smallestDigitLocation(int n) {
		if (n < 0)
			n = -n;
		if (n == 0)
			return 0;
		int smallestDigit = smallestDigit(n);
		if (n%10 == smallestDigit) {
			return 1;
		}
		return smallestDigitLocation(n/10) + 1;
	}
}