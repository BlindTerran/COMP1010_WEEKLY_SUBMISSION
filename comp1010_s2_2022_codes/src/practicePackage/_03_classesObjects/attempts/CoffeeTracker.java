package practicePackage._03_classesObjects.attempts;

public class CoffeeTracker {
	public int[] coffeesPerDay;
	


	/**
	 * May be helpful for other methods
	 * 
	 * create an instance copy of data into coffeesPerDay. The two
	 * objects, data and coffeesPerDay, should have the same values but
	 * NOT refer to the same instance.
	 * @param data (you may assume data.length > 0)
	 */
	public CoffeeTracker(int[] data) {

		coffeesPerDay = new int[data.length];
		for (int i=0; i<coffeesPerDay.length; i++) {
			coffeesPerDay[i] = data[i];
		}
	}

	// Return the average number of coffees consumed
	public double averageCoffeesConsumed() {
		double average = 0;
		double sum = 0;
		for (int i=0; i<coffeesPerDay.length; i++) {
			sum += coffeesPerDay[i];
		}
		average = sum/coffeesPerDay.length;
		return average;
	}
}