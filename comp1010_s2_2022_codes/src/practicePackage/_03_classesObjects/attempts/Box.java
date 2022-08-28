package practicePackage._03_classesObjects.attempts;

/**
 * 
 * @author gauravgupta
 *         Box represents a three dimensional cuboid. We use the front
 *         perspective
 *         such that
 *         the side from front to back is depth
 *         the side from top to bottom is height
 *         the side from left to right is width
 * 
 *         IMPORTANT: Do NOT override equals()
 */
public class Box {
	public int depth, height, width;

	/**
	 * May be helpful for other methods
	 * 
	 * NOTE: if any of the values are less than 1, they should be made 1 before
	 * copying into
	 * corresponding instance variable
	 * 
	 * @param d (for depth)
	 * @param h (for height)
	 * @param w (for width)
	 */
	public Box(int d, int h, int w) {
		this.depth = (d < 1) ? 1 : d; // if d < 1, this.depth = 1; else, this.depth = d
		this.height = (h < 1) ? 1 : h;
		this.width = (w < 1) ? 1 : w;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * copy constructor to create an instance copy of the passed object
	 * 
	 * @param original
	 */
	public Box(Box original) {
		this.width = original.width;
		this.height = original.height;
		this.depth = original.depth;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * @return the volume of the box
	 */
	public int volume() {
		int result = 0;
		result = this.depth * this.height * this.width;
		return result;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 *         -1 if calling object is "less than" parameter object
	 *         0 if calling object is "equal to" parameter object
	 *         comparison criteria: volume -> surface area
	 *
	 */
	public int compareTo(Box other) { // volume -> surface area
		if (this.volume() == other.volume()) {
			if (this.surfaceArea() == other.surfaceArea()) {
				return 0;
			}
			if (this.surfaceArea() < other.surfaceArea()) {
				return -1;
			} else {
				return 1; // this.surfaceArea > other
			}
		} else if (this.volume() < other.volume()) {
			return -1;
		} else {
			return 1; // this.volume > other
		}
	}

	/**
	 * May be helpful for other methods
	 * 
	 * HD
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 *         -1 if calling object is "less than" parameter object
	 *         0 if calling object is "equal to" parameter object
	 *         comparison criteria: volume -> surface area -> longest sides ->
	 *         second longest sides -> shortest side
	 */
	public int compareToAdvanced(Box other) {
		
		int result = 0;
		if (this.compareTo(other) == 1) {
			return 1;
		} else if (this.compareTo(other) == -1) {
			return -1;
		} else {
			//if volume and surface area are the same -> longest side
			if (this.longestSide() > other.longestSide()) {
				result = 1;
			} else if (this.longestSide() < other.longestSide()) {
				result = -1;
			} else {
				//longest sides are the same -> second longest side
				result = 0;
			}
		}
		if (result == 0) {
			if (this.secondLongest() > other.secondLongest()) {
				result = 1;
			} else if (this.secondLongest() < other.secondLongest()) {
				result = -1;
			} else {
				//second longest sides are the same -> shortest side
				result = 0;
			}
		}
		if (result == 0) {
			if (this.shortest() > other.shortest()) {
				result = 1;
			} else if (this.shortest() < other.shortest()) {
				result = -1;
			} else {
				//shortest sides are the same: all the criterias have the same result
				result = 0;
			}
		}
	return result;
}

	/**
	 * 
	 * @return the longest side of the box
	 */
	public int longestSide() {

		if (this.width >= this.height && this.width >= this.depth) {
			return this.width;
		} 
		else if (this.height >= this.width && this.height >= this.depth) {
			return this.height;
		}
		else if (this.depth >= this.height && this.depth >= this.width) {
			return this.depth;
		} 
		else { //all the sides are the same
			return this.width;
		}
	}

	public int shortest() {
		if (this.width <= this.height && this.width <= this.depth) {
			return this.width;
		} 
		else if (this.height <= this.width && this.height <= this.depth) {
			return this.height;
		}
		else if (this.depth <= this.height && this.depth <= this.width) {
			return this.depth;
		} 
		else { //all the sides are the same
			return this.width;
		}
	}

	public int secondLongest() {
		int result;
		result = (this.width + this.height + this.depth) - this.longestSide() - this.shortest();
		return result;
	}

	/**
	 * 
	 * @return area of the front (or the back face)
	 */
	public int frontArea() {
		int result = 0;
		result = this.width * this.height;
		return result;
	}

	/**
	 * 
	 * @return the surface area of the box
	 */
	public int surfaceArea() {
		int result = 0;
		result = 2 * ((this.width * this.depth) + (this.width * this.height) + (this.depth * this.height));
		return result;
	}

	/**
	 * D
	 * 
	 * @param b
	 * @return true if the box represented by the calling object
	 *         can fit inside the box represented by the parameter object, false
	 *         otherwise.
	 *         Note that a box cannot fit inside the box of the same dimension.
	 */
	public boolean canFitInside(Box b) {
		int rotatedWidth = this.depth;
		int rotatedHeight = this.width;
		int rotatedDepth = this.height;
		int rotatedWidth2 = this.height;
		int rotatedHeight2 = this.depth;
		int rotatedDepth2 = this.width;
		if (this.width < b.width && this.height < b.height && this.depth < b.depth) {
			return true;
		}
		else if (rotatedWidth < b.width && rotatedHeight < b.height && rotatedDepth < b.depth) {
			return true;
		}
		else if (rotatedWidth2 < b.width && rotatedHeight2 < b.height && rotatedDepth2 < b.depth) {
			return true;
		} else {
			return false;
		}
	}
}