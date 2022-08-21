package practicePackage._01_introduction.attempts;


public class Stage4 {


	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the LAST index at which target exists in data, -1 if it doesn't exist
	 */
	public static int lastIndexOf(int[] data, int target) {
		int position = -1;
		for (int i=0; i<data.length; i++) {
			if (data[i] == target) {
				position = i;
			}
		}
		return position;
	}

	/**
	 * @param a
	 * @param b
	 * @return the highest integer that divides both a and b.
	 * for example, 
	 * gcd(70, 40) = 10
	 * gcd(-70, 40) = 10
	 * gcd(15, 32) = 1
	 * gcd(-51, 153) = 51
	 */
	public static int gcd(int a, int b) {
		int gcd = 1;
		int a1 = Math.abs(a);
		int b1 = Math.abs(b);
		for (int i=1; i<=a1 && i<=b1; i++) {
			if (a1%i == 0&&b1%i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	/**
	 * 
	 * @param n
	 * @return true if n is a perfect square (square of an integer), false otherwise
	 */
	public static boolean isSquare(int n) {
		double sqrt = Math.sqrt(n);
		if (sqrt == (int)sqrt) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param val (val could be positive or zero or negative)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOffAdvanced(double val) {
		int integer = (int)val;
		double decimal = Math.abs(val) - Math.abs(integer);
		if (decimal < 0.5) {
			return integer;
		} else {
			if (val >= 0) {
				return integer + 1;
			} else {
				return integer - 1;
			}
		}
	}

	/**
	 * 
	 * @param val (val can be positive or zero or negative)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceilingAdvanced(double val) {
		if (val == (int)val || val < 0){
			return (int)val;
		} else {
			double temp = val + 1;
			return (int)temp;
		}
	}

	/**
	 * 
	 * @param str
	 * @return true if every character in str is a digit ('0' to '9'), false otherwise.
	 * also, return false if str is empty.
	 */
	public static boolean isNumeric(String str) {
		boolean isNumeric = false;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				isNumeric = true;
			} else {
				isNumeric = false;
				break;
			}
		}
		return isNumeric;
	}

	/**
	 * 
	 * @param str
	 * @return the reverse of the String passed
	 */
	public static String reverse(String str) {
		int count = str.length();
		if (count == 1) {
			return str;
		} else {
			char newChar[] = new char[str.length()];
			for (int i=str.length()-1; i>=0; i--) {
				if (i == 0) {
					newChar[str.length()-1] = str.charAt(i);
				} else {
					newChar[str.length()-i-1] = str.charAt(i);
				}
			}
			String result = new String(newChar);
			return result;
		}
	}
	

	/**
	 * 
	 * @param n
	 * @return true if the passed integer is a concatenation of two
	 * squares. For example, if n = 164, return true since it's a 
	 * concatenation of 1 and 64, both of which are squares. 
	 * If n = 86, return false.
	 * If n = 25, return false, since although the number itself
	 * is a square, it cannot be split along a line into two integers,
	 * each of which is a square.
	 */
	public static boolean isConcatTwoSquares(int n) {
		int count = 0;
		while (n != 0) {
			n/=10;
			count ++;
		}

		int middle = (int)count/2;
		String number = Integer.toString(n);
		char secondPart[] = new char[count-middle];

		if (count%2 == 0) {						//if even
			for (int i=1; i<=middle; i++) {
				n/=10;							//first part
			}
		}
		int index = 0;
		for (int i=middle+1; i<count; i++) {
			secondPart[index] = number.charAt(i);
			index++; 
		}
		//char[] convert to string
		//string to integer -> left part and right part
		//check if the integer can be solved in to sequare root
		//if yes return true, else false
		return false;
	}
}