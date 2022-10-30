package practicePackage._08_recursiveDataStructures.attempts;

import practicePackage._08_recursiveDataStructures.Node;

public class MyLinkedList {
	public Node head;
	

 
	//DO NOT MODIFY
	public MyLinkedList() {
		head = null;
	}

	/**
	 * DO NOT MODIFY
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * DO NOT MODIFY
	 * insert the value val at the beginning of the list
	 * if the list = null before calling the method
	 * and val = 50, then list should become [50]
	 * after the method finishes execution
	 * @param val
	 */
	public void addAtFront(int val) {
		Node temp = new Node(val, null);
		temp.next = head;
		head = temp;
	}

	public void addAtBack(int val) {
		if (isEmpty()) {
			Node temp = new Node(val, null);
			head = temp;

			// terminal method
			return ;
		}

		// when list is not empty, append the new node
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(val, null);
	}

	//DO NOT MODIFY
	public String toString() {
		String result = "[";
		Node current = head;
		while(current != null) {
			result = result + current.data + ", ";
			current = current.next;
		}
		if(result.length() > 1) {
			result = result.substring(0, result.length()-2);	
		}
		return result + "]";
	}

	/**
	 * DO NOT MODIFY - given as an example of traversal
	 * @return number of items in the list
	 */
	public int size() {
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/**
	 * 
	 * @param idx
	 * @return true if an item can be added at the passed idx
	 * 
	 * FOR EXAMPLE,
	 * if list represents [10, 70, 20, 90],
	 * items can be added at indices 
	 * 0 (before the first item), 1, 2, 3, 4 (after the last item) 
	 * but not at indices [... -2, -1] or [5, 6, ..]
	 */
	public boolean canInsertItemAt(int idx) {
		// if list is empty, new item can only be inserted at idx 0
		if (isEmpty()) {
			if (idx == 0) { 
				return true;
			} 
			else {
				return false;
			}
		}
		return idx >= 0 && idx <= size();
	}

	/**
	 * 
	 * @return the sum of all positive items (0 if the list is empty)
	 */
	public int totalPositives() {
		if (isEmpty()) return 0;
		Node current = head;
		int total = 0;
		while (current != null) {
			if (current.data > 0) {
				total += current.data;
			}

			// change the current reference to the next item
			current = current.next;
		}
		return total;
	}

	/**
	 * @param target: item to count
	 * @return the number of time target exists in the list 
	 * (0 if the list is empty)
	 */
	public int countOccurrences(int target) {
		if (isEmpty()) return 0; 
		Node current = head;
		int count = 0;
		while (current != null) {
			if (current.data == target) {
				count ++;
			}
			current = current.next;
		}
		return count;

	}

	/**
	 * 
	 * @return true if all items are even numbers, false otherwise
	 * return true if list is empty
	 * 
	 */
	public boolean allEven() {
		if (isEmpty()) return true;
		Node current = head;
		while (current != null) {
			// when find one is not even, return false straight away
			if (current.data % 2 != 0) {
				return false;
			}
			current = current.next;
		}
		return true;
	}

	/**
	 * 
	 * @param low
	 * @param high
	 * @return true if ANY item is in the range [low...high]
	 * false otherwise.
	 * 
	 * return false if list is empty
	 */
	public boolean containsInRange(int low, int high) {
		if (isEmpty()) return false;

		Node current = head;
		while (current != null) {
			if (current.data >= low && current.data <= high) {
				return true;
			} 
			current = current.next;
		}
		return false;
	}

	/**
	 * 
	 * @return the highest item in the list
	 * return null if empty
	 * list represents [10, 70, 20, 90], return 90
	 * head = null, return null
	 * list represents [0, 0, 0, 0, return 0
	 */
	public Integer highest() {
		if (isEmpty()) return null;

		int highest = 0;
		Node current = head;
		while (current != null) {
			if (highest < current.data) {
				highest = current.data;
			}
			current = current.next;
		}
		return highest;
	}

	/**
	 * O(n) :(
	 * that's why no one uses linked lists!
	 * @param idx
	 * @return item at given index if index is valid, null otherwise
	 */
	public Integer get(int idx) {
		if (isEmpty()) return null;
		
		//check if idx valid using helper method
		if (! indexValidation(idx)) return null;

		Node current = head;
		for (int i=0; i<idx; i++) {
			current = current.next;
		}
		return current.data;

	}

	/**
	 * Helper method to validate the index
	 * If the index is less than zero or greater than or equal to the size of the list, return false,
	 * otherwise return true. (Auto-generated)
	 * 
	 * @param idx The index to be validated.
	 * @return The method is returning a boolean value.
	 */
	public boolean indexValidation(int idx) {
		return (idx >= 0 && idx < size());
	}

	/**
	 * D level
	 * Best case (idx = 0): O(1)
	 * Worst case (idx = size()-1): O(n)
	 * remove and return item at given idx if any
	 * @param idx
	 * @return item remove, null if idx invalid
	 */
	public Integer remove(int idx) {
		if (isEmpty()) return null;
		if (! indexValidation(idx)) return null;

		// in case of removing the first item
		if (idx == 0) {

			// back-up the item to be remvoed
			int itemRemoved = head.data;

			// dereference the first node 
			head = head.next;
			return itemRemoved;
		}

		// in case of not the first item to remove
		Node current = head;

		// update current to the node before the one to be removed
		for (int i=0; i<idx-1; i++) {
			current = current.next;
		}
			// back-up the item to be remvoed
			int itemRemoved = current.next.data;

			// dereference the node, pointer at the next of the item to be removed
			current.next = current.next.next;
			return itemRemoved;
	}

	/**
	 * 
	 * @param other
	 * @return MyLinkedList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * if 
	 * calling object holds [10, 70, 20]
	 * parameter object (other) holds [50, 90]
	 * 
	 * then for the returned object,
	 * list represents [10, 70, 20, 50, 90]
	 */
	public MyLinkedList join(MyLinkedList other) {
		MyLinkedList newList = new MyLinkedList();

		// in case of t he calling list is empty
		if (isEmpty()) {

			//make reference pointing at the second list right away
			newList.head = other.head; 
			return newList;
		}
		
		Node current = this.head;
		while (current != null) {
			newList.addAtBack(current.data);
			current = current.next;
		}

		Node current2 = other.head;
		while (current2 != null) {
			newList.addAtBack(current2.data);
			current2 = current2.next;
		}
		return newList;
	}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 *
	 * if 
	 * calling object holds [10, 70, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return true
	 *
	 * if 
	 * calling object holds [10, 60, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [10, 20]
	 * return false
	 */
	public boolean same(MyLinkedList other) {
		if (this.isEmpty() && other.isEmpty()) return true;
		if (this.size() != other.size()) return false;

		Node current1 = this.head;
		while (current1 != null) {
			
			boolean found = false;

			//reset start point for inner loop
			Node current2 = other.head;
			while (current2.next != null) {

				//if found a match, break and look for the next match
				if (current1.data == current2.data) {
					found = true;
					break;
				}

				//increment the inner loop
				current2 = current2.next;
			}
			// current2 now pointing at the last item
			if (!found && current2.data != current1.data) {
				return false;
			}

			current1 = current1.next;
		}
		return true;
	}

	public int dummyGetlastItem() {
		Node current = head;
		for (int i=0; i<size()-1; i++) {
			current = current.next;
		}
		return current.data;
	}
}