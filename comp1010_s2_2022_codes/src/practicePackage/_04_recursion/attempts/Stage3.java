package practicePackage._04_recursion.attempts;

public class Stage3 {


	/**
	 * 
	 * @param n
	 * @param loc
	 * @return the number with digit at location loc removed (if any).
	 * note: the least significant digit is at location 1, the secon-least significant digit is at location 2, and so on.
	 */
	public static int removeDigit(int n, int loc) {
		if (loc < 1 ) {
			return n;
		}
		if (loc == 1) {
			return n/10;
		}
		return removeDigit(n/10, loc-1) * 10 + n%10;
		
		
	}

	
	public static double powerV2(int x, int n) {
		return powerV2Helper(x, n, 1);
	}

	public static double powerV2Helper(int x, int n , int current) {
		if (n <= 0) {
			if(n == 0) {
				return 1.0/current;
			}
			return powerV2Helper(x, n+1, current*x);
		}
		else {
			if (n == 0) {
				return current;
			}
			return powerV2Helper(x, n-1, current*x);
		}
	}

	/**
	 * 
	 * @param n (assume n is more than or equal to zero)
	 * @param destBase (assume destBase is a number between 2 and 10)
	 * @return the number in destBase base.
	 * for example,
	 * convert(13, 2) returns "1101" since 13 in base-2 is 1101 (1*8 + 1*4 + 0*2 + 1*1 = 13)
	 * convert(19, 3) returns "201" since 19 in base-3 is 211 (2*9 + 0*3 + 1*1 = 19)
	 * convert(1905, 8) returns "3561" since 1905 in base-8 is 3561 (3*512 + 5*64 + 6*8 + 1*1 = 1905)
	 */
	public static String convert(int n, int destBase) {
		// if (n == 0) {
		// 	return "";
		// }
		// return convert(n/destBase, destBase) + n%destBase;

		//doesn's pass the first test
		return "";
	}

		/**
	 * 
	 * @param n
	 * @param d
	 * @return the number of "weighted" count of the digit d in number n. 
	 * If d is preceded by another occurrence of d, the weight for that occurrence be 2, otherwise 1.
	 */
	public static int countWeighted(int n, int d) {
		return 0; //to be completed
	}

	public static int countNumberOfDigit(int n) {
		if (n <= 0) {
			if (n > -9) {
				return 1;
			}
			return 1 + countNumberOfDigit(n/10); 
		} 

		if (n < 9 &&  n > 0) {
			return 1;
		}
		return 1 + countNumberOfDigit(n/10);
	}
	/**
	 * 
	 * @param n
	 * @return the number with the first digit removed
	 * you may, and should use functions from stages 1 and 2
	 */
	public static int withoutFirstDigit(int n) {
		if (n < 0 && n > -9) {
			return 0;
		}
		if (n < 9 && n >= 0) {
			return 0;
		}
		int digitCount = countNumberOfDigit(n);
		return removeFirstDigit(n, digitCount);
	}
	
	public static int removeFirstDigit(int num, int idx) {
		if (idx == 1) {
			return num/10;
		}
		return removeFirstDigit(num/10, idx-1)*10 + num%10;
	}

	/**
	 * 
	 * @param n
	 * @return the smallest number that can be formed by re-arranging the digits of n.
	 */
	public static int smallestNumber(int n) {
		return 0;
	}

	/**
	 * two Strings are anagrams of each other if you can rearrange one to form the other one.
	 * @param s1
	 * @param s2
	 * @return true if s1 and s2 are anagrams of each other, false otherwise
	 */
	public static boolean areAnagrams(String s1, String s2) {
		return false; //to be completed
	}

	/**
	 * a polynomial is defined as 
	 * (c_0 *  x^0) +  (c_1 *  x^1) + ... (c_n *  x^n)
	 * 
	 * For example, take the polynomial 3 + 5x - 7(x^2) + 9(x^5)
	 * c_0 = 3
	 * c_1 = 5
	 * c_2 = -7
	 * c_3 = 0
	 * c_4 = 0
	 * c_5 = 9
	 * this is represented as the array coefficients {3, 5, -7, 0, 0, 9}
	 * 
	 * when we plug in the value of x = 2, 
	 * it evaluates to (2^0)*3 + (2^1)*5 + ... + (2^5)*9
	 * = 3 + 10 - 28 + 288 
	 * = 273 
	 * 
	 * @param coefficients (contains the values for the coefficients, coefficients[0] contains value for c_0)
	 * @param maxDegree (contains the highest degree to consider. the array coefficients might have 10 terms but 
	 * if maxDegree = 3, only items up to, and including index [3] should be evaluated).
	 * @param xValue
	 * @return
	 */
	public static double evaluatePolynomial(int[] coefficients, int maxDegree, int xValue) {
		return 0; //to be completed
	}
}