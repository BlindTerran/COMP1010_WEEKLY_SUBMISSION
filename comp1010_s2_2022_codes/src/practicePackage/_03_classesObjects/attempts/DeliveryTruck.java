package practicePackage._03_classesObjects.attempts;

public class DeliveryTruck {
	public Box[] boxes;

	


	/**
	 * May be helpful for other methods
	 * 
	 * P
	 * @return total volume of all the boxes
	 */
	public int totalVolume() {
		int total = 0;
		for (int i=0; i<boxes.length; i++) {
			total += boxes[i].volume();
		}
		return total;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * HD
	 * @return the number of boxes that are "identical"
	 * Please refer to Box class about how to check for identical boxes.
	 * 
	 * For example, if you have boxes of:
	 * 1 x 3 x 2, 1 x 2 x 3, 2 x 1 x 3, 10 x 10 x 10, 4 x 4 x 5, 2 x 3 x 1 and 5 x 4 x 4
	 * all four boxes with one of the sides = 1 are identical
	 * and both boxes with one of the sides = 5 are identical
	 * so return 6 (4+2)
	 */
	// public static void storeVisited(int data) {
	// 	int n = 1; 
	// 	int[] visited = new int[n];
	// 	for (int i=0; i<visited.length; i++) {
	// 		visited[i] = data;
	// 	}
	// }
	// public boolean checkVisited(int data) {
	// 	for (int i=0; i<sotreVisited().visited.length; i++) {

	// 	}
	// }
	public int countIdenticalBoxes() {
		// int count = 0;
		// int n = 1;
		// Box[] visited = new Box[n];
		// for (int i=0; i<boxes.length; i++) {
		// 	for (int k=0; k<boxes.length; k++) {
		// 		//check whether boxes[i] is visited
		// 			if (boxes[i] == visited[]) {
		// 				break;
		// 			} else {
		// 				if (boxes[i].width == boxes[k].width && boxes[i].height == boxes[k].height && boxes[i].depth == boxes[k].depth) {
		// 					count++;
		// 				}
		// 		}
		// 	}
		// 	//store the visited box into visited array
		// 	visited[i] = new Box(boxes[i]);
		// 	n++;
		// }
		// if (count == boxes.length) {
		// 	return 0;
		// } else {
		// 	return count;
		// }
		return 0;
	}


	/**
	 * Do not modify
	 * 
	 * create an instance copy of array parcels into boxes.
	 * also, each item of boxes should be an instance copy of the corresponding item in parcels.
	 * @param parcels
	 */
	public DeliveryTruck(Box[] parcels) {
		boxes = new Box[parcels.length];
		for(int i=0; i < parcels.length; i++) {
			boxes[i] = new Box(parcels[i]);
		}
	}

	/**
	 * P
	 * @param vol
	 * @return true if the truck contains any box with given volume, false otherwise
	 */
	public boolean contains(int vol) {
		boolean flag = false;
		for (int i=0; i<boxes.length; i++) {
			if (boxes[i].volume() == vol) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * D
	 * @param b
	 * append Box b to the end of the array.
	 * IMPORTANT: the current items should remain unchanged.
	 * so if boxes[0] refers to instance X before adding b,
	 * boxes[0] should refer to the same instance X after adding b,
	 * same for boxes[1], boxes[2] ... boxes[boxes.length-1] (all items before adding b)
	 */
	public void add(Box b) {
		Box[] newBoxes = new Box[boxes.length+1];
		for(int i=0; i<boxes.length; i++) {
			newBoxes[i] = boxes[i];
		}
		//append Box b, call the constructor
		newBoxes[newBoxes.length-1] = new Box(b);
		boxes = newBoxes;
	}
}