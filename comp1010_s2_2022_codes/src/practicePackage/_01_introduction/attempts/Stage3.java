package practicePackage._01_introduction.attempts;

public class Stage3 {

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive EVEN integers (2+4+...+(2*n))
	 */
	public static int sumEvenV1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (2 * i);
		}
		return sum;
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive even integers up to, and including n
	 *         either (2+4+...+n) or (2+4+...+(n-1))
	 */
	public static int sumEvenV2(int n) {
		int sum = 0;
		int increment = 2;
		while (increment <= n) {
			sum += increment;
			increment += 2;
		}
		return sum;
	}

	/**
	 * 
	 * @param n
	 * @return the product of the first n positive integers.
	 *         for example, if n = 5, return 1*2*3*4*5 = 120
	 *         return 1 if n < 1
	 */
	public static int product(int n) {
		int product = 1;
		if (n < 1) {
			return product;
		} else {
			for (int i=1; i<=n; i++) {
				product *= i;
			}
			return product;
		}
	}

	/**
	 * 
	 * @param n
	 * @return the productOdd of the first n odd positive integers.
	 *         for example, if n = 5, return 1*3*5*7*9 = 945
	 *         return 1 if n < 1
	 */
	public static int productOdd(int n) {
		int product = 1;
		if (n < 1) {
			return product;
		} else {
			int multiplier = 1;
			int i = 1;
			while (i <= n) {
				product *= multiplier;
				multiplier += 2;
				i ++;
			}
			return product;
		}
	}

	/**
	 * 
	 * @param x
	 * @param n (assume n is more than or equal to 0)
	 * @return x to the power of n without using Math library
	 */
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			int result = 1;
			for (int i=1; i<=n; i++) {
				result *= x;		
			}
			return result;
		}
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @return the sum of all even numbers in data
	 */
	public static int sumEven(int[] data) {
		int sum = 0;
		for (int i=0; i<data.length; i++) {
			if (data[i]%2 == 0) {
				sum += data[i];
			}
		}
		return sum;
	}
}