package practicePackage._03_classesObjects.attempts;

import java.text.DecimalFormat;

/**
 * the class stores time in a 24-hour format.
 * hour = 9, minute = 20 represents the time 9:20 am
 * hour = 17, minute = 35 represents the time 5:35 pm
 * 
 */
@SuppressWarnings("unused")
public class Time {
	public int hour, minute;
	


	/**
	 * May be helpful for other methods
	 * 
	 * constructor: assign the parameters to corresponding instance variables
	 * @param h: value intended for hour
	 * hour should become 0 if h is less than 0
	 * hour should become 23 if h is more than 23
	 * @param m: value intended for minute
	 * minute should become 0 if m is less than 0
	 * minute should become 59 if m is more than 59 
	 */
	public Time(int h, int m) {
		if (h < 0) {
			this.hour = 0;
		} else {
			if (h > 23) {
				this.hour = 23;
			} else {
				this.hour = h;
			}
		}

		if (m < 0) {
			this.minute = 0;
		} else {
			if (m > 59) {
				this.minute = 59;
			} else {
				this.minute = m;
			}
		}
	}

	public static int countDigit(int value) {
		int count = 0;
		while (value > 0) {
			value /= 10;
			count ++;
		}
		return count;
	}
	/**
	 * May be helpful for other methods
	 * 
	 * return time in the form hh:mm
	 * if hour = 8, minute = 3, return "08:03"
	 * if hour = 16, minute = 9, return "16:09"
	 * if hour = 17, minute = 25, return "17:25"
	 * HINT: use string concatenation:  "0" (String) + 5 (int) gives "05" (String)
	 * HINT 2: you can use DecimalFormat class
	 */
	public String toString() {
		//if hour has 2 digits
		if (countDigit(this.hour) > 1) {
			//and minute has 2 digits
			if (countDigit(minute) > 1) {
				return this.hour + ":" + this.minute;
			} else {
				//and minute has 1 digit
				return this.hour + ":" + "0" + this.minute;
			}
		//if hour has 1 digit
		} else {
			if (countDigit(minute) > 1) {
				return "0" + this.hour + ":" + this.minute;
			} else {
				return "0" + this.hour + ":" + "0" + this.minute;
			}
		}
	}

	//DEFAULT CONSTRUCTOR, Do not modify
	public Time() {
		//DO NOT MODIFY!!!!
	}

	
	public String toStringAMPM() {
		if (this.hour < 12) {
			return toString() + " AM";
		} else {
			this.hour = this.hour - 12;
			return toString() + " PM"; 
		}
	}
}