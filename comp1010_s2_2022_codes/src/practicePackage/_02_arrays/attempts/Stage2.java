package practicePackage._02_arrays.attempts;

import serviceClasses.MathService;

public class Stage2 {


	/**
	 * 
	 * @param data
	 * @return the sum of all even items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumEven(int[] data) {
		if (data == null) {
			return 0;
		} else {
			int sum = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i]%2 == 0) {
					sum += data[i];
				}
			}
			return sum;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all positive (more than 0) items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumPositives(int[] data) {
		if (data != null) {
			int sum = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i] > 0) {
					sum += data[i];
				}
			}
			return sum;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the sum of all items of the array passed that are multiples of n.
	 * return 0 if the array is null
	 */
	public static int sumMultiples(int[] data, int n) {
		if (data != null) {
			int sum = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i]%n == 0) {
					sum += data[i];
				}
			}
				return sum;				
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return sum of all items of the array passed that lie in the number range [low...high]
	 */
	public static int sumInRange(int[] data, int low, int high) {
		if (data != null) {
				int sum = 0;
				for (int i=0; i<data.length; i++) {
					if (data[i] >= low && data[i] <= high) {
					sum += data[i];
					}
				}
				return sum;
			} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all items at even indices of the array passed
	 */
	public static int sumEvenIndexedItems(int[] data) {
		if (data == null) {
			return 0;
		} else {
			int sum = 0;
			for (int i=0; i<data.length; i+=2) {
				sum += data[i];
			}
			return sum;
		}
	}

	/**
	 * 
	 * @param data
	 * reset any negative value(s) in the array passed to zero.
	 */
	public static void resetNegatives(int[] data) {
		if (data == null) {
			return ;
		} else {
			for (int i=0; i<data.length; i++) {
				if (data[i] < 0) {
					data[i] = 0;
				}
			}
		}
	}

	/**
	 * 
	 * @param data
	 * update each item of the array to the square of itself.
	 */
	public static void squareUp(int[] data) {
		if (data == null) {
			return ;
		} else {
			for (int i=0; i<data.length; i++) {
				data[i] = data[i] * data[i];			
			}
		}
	}

	/**
	 * 
	 * @param data
	 * @return the number of odd numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countOdd(int[] data) {
		if (data == null) {
			return 0;
		} else {
			int count = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i]%2 != 0) {
					count ++;
				}
			}
			return count;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the number of negative (less than 0) numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countNegatives(int[] data) {
		if (data == null) {
			return 0;
		} else {
			int count = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i] < 0) {
					count ++;
				}
			}
			return count;
		} 
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the number of items in the array passed of which n is a multiple.
	 * return 0 if the array is null.
	 */
	public static int countFactors(int[] data, int n) {
		if (data == null) {
			return 0;
		} else {
			int count = 0;
			for (int i=0; i<data.length; i++) {
				if (n % data[i] == 0)  {
					count ++;
				}
			}
			return count;
		}
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return number of items in the array passed that are OUTSIDE the number range [low...high].
	 * return 0 if the array is null.
	 */
	public static int countNotInRange(int[] data, int low, int high) {
		if (data == null) {
			return 0;
		} else {
			int count = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i]<low || data[i]>high) {
					count ++;
				}
			}
			return count;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the number of items in the array passed that occur exactly once in the array.
	 * return 0 if array is null.
	 * HINT: use countOccurrences(int[], int)
	 */

	public static int countOccurrences (int[] data, int target) {
		int occurrenceCount = 0;
		for (int i=0; i<data.length; i++) {
			if (target == data[i]) {
				occurrenceCount ++;
			}
		}
		return occurrenceCount;
	}
	public static int countUnique(int[] data) {
		if (data ==null) {
			return 0;
		} else {
			int count = 0;
			for (int i=0; i<data.length; i++) {
				if (countOccurrences(data, data[i]) == 1) {
					count ++;
				}
			}
			return count;
		}
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @return the first index at which target exists in the array passed.
	 * return -1 if array is null or target doesn't exist in the array.
	 */
	public static int indexOf(int[] data, int target) {
		if (data == null) {
			return -1;
		} else {
			int index = -1;
			for (int i=0; i<data.length; i++) {
				if (data[i] == target) {
					index = i;
					break;
				}
			}
			return index;
		}
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @return true if target exists at index startIndex or later in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array starting at index startIndex.
	 */
	public static boolean containsFromIndex(int[] data, int target, int startIndex) {
		if (data == null || startIndex < 0 || startIndex >= data.length) {
			return false;
		} else {
			boolean flag = false;
			for (int i=startIndex; i<data.length; i++) {
				if (target == data[i]) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return true if target exists in the index range [startIndex...endIndex] at which target exists in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array in the index range [startIndex...endIndex].

	 */
	public static boolean containsBetweenIndices(int[] data, int target, int startIndex, int endIndex) {
		if (data == null ) {
			return false;
		} else {
			boolean flag = false;
			for (int i=startIndex; i<=endIndex; i++) {
				if (data[i] == target) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return sum of all items at index endIndex or lower in the array passed.
	 * return 0 if array is null.
	 */
	public static int sumUptoIndex(int[] data, int endIndex) {
		if (data == null || endIndex >= data.length) {
			return 0;
		} else {
			int sum = 0;
			for (int i=0; i<=endIndex; i++) {
				sum += data[i];
			}
			return sum;
		}
	}

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @return sum of all even numbers at index startIndex or later.
	 * return 0 if array is null.
	 */
	public static int sumEvenFromIndex(int[] data, int startIndex) {
		if (data == null || startIndex < 0) {
			return 0;
		} else {
			int sum = 0;
			for (int i=startIndex; i<data.length; i++) {
				if (data[i]%2 == 0) {
					sum += data[i];
				}
			}
			return sum;
		}
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return product of all positive items up to index endIndex.
	 * return 1 if array is null or if no positive items exist up to index endIndex.
	 */
	public static int productPositivesUptoIndex(int[] data, int endIndex) {
		if (data == null || endIndex >= data.length) {
			return 1;
		} else {
			int product = 1;
			for (int i=0; i<=endIndex; i++) {
				if (data[i] > 0) {
					product *= data[i];
				}
			}
			return product;
		}
	}

	/**
	 * 
	 * @param data
	 * @param key
	 * @param startIndex
	 * @param endIndex
	 * @return number of times key exists in the array between the indices startIndex and endIndex.
	 * return 0 if array is null or if key doesn't exist between indices startIndex and endIndex. 
	 */
	public static int countOccurrencesBetweenIndices(int[] data, int key, int startIndex, int endIndex) {
		if (data == null || startIndex < 0 || endIndex >= data.length) {
			return 0;
		} else {
			int count = 0;
			for (int i=startIndex; i<=endIndex; i++) {
				if (data[i] == key) {
					count ++;
				}
			}
			return count;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are positive (more than 0), false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allPositives(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = true;
			for (int i=0; i<data.length; i++) {
				if (data[i] <= 0) {
					flag = false;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are zero, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allZeroes(int[] data) {
		if (data == null) {
			return false;
		} else {
			if (data.length == 0) {
				return true;
			} else {
				boolean flag = true;
				for (int i=0; i<data.length; i++) {
					if (data[i] != 0) {
						flag = false;
					}
				}
				return flag;
			}
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are prime, false otherwise.
	 * You can use the method isPrime from class MathService.
	 * To check if an integer (val) is prime, use the expression MathService.isPrime(val) == true
	 * return false if the array is null.
	 */
	public static boolean allPrimes(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = true;
			for (int i=0; i<data.length; i++) {
				if (MathService.isPrime(data[i]) != true) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one negative (less than 0) value in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNegative(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = false;
			for (int i=0; i<data.length; i++) {
				if (data[i] < 0) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one non-zero in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNonZero(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = false;
			for (int i=0; i<data.length; i++) {
				if (data[i] != 0) {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if the array is in ascending order, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isAscending(int[] data) {
		if (data == null) {
			return false;
		} else {
			if (data.length == 1) {
				return true;
			} else {
				boolean flag = true;
				for (int i=0; i<data.length; i++) {
					if (i == data.length-2) {
						break;
					} else {
						if (data[i] > data[i+1]) {
							flag = false;
						}
					}
				}
				return flag;
			}
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are the same, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isUnchanged(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = true;
			for (int i=0; i<data.length; i++) {
				for (int k=0; k<data.length; k++) {
					if (data[i] != data[k]) {
						flag = false;
					}
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if the array contains the same number of positive (more than 0) and negative (less than 0) items.
	 * return false if array is null.
	 */
	public static boolean isBalanced(int[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = false;
			int countPositive = 0;
			int countNegative = 0;
			for (int i=0; i<data.length; i++) {
				if (data[i] > 0) {
					countPositive ++;
				} else {
					if (data[i] < 0) {
						countNegative ++;
					}
				}
			}
			if (countPositive == countNegative) {
				flag = true;
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return true if at least 1 item of the array is a valid digit ('0' to '9'), false otherwise.
	 * return false if array is null.
	 */
	public static boolean containsDigit(char[] data) {
		if (data == null) {
			return false;
		} else {
			boolean flag = false;
			for (int i=0; i<data.length; i++) {
				if (data[i] > '0' && data[i] < '9') {
					flag = true;
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * 
	 * @param data
	 * @return a copy of the array.
	 * NOTE: the array returned SHOULD NOT refer to the same collection
	 * that the array passed refers to. 
	 * In other words
	 * if you update the values in the array returned, 
	 * the values in the array passed should not change. 
	 */
	public static int[] getCopy(int[] data) {
		if (data == null) {
			return data;
		} else {
			int newData[] = new int[data.length];
			for (int i=0; i<data.length; i++) {
				newData[i] = data[i];
			}
			return newData;
		}
	}
}