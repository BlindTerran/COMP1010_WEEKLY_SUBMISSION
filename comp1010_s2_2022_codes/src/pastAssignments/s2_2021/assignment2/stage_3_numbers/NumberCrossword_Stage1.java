package pastAssignments.s2_2021.assignment2.stage_3_numbers;

//Complete this (successfully) before moving to NumberCrossword_Stage2
public class NumberCrossword_Stage1 {
	public int[][] board;

	/**
	 * 
	 * @param n assume n > 0
	 */
	public NumberCrossword_Stage1(int n) {
		board = new int[n][n];
		for(int i=0; i < board.length; i++) {
			for(int k=0; k < board.length; k++) {
				board[i][k] = (int)((Math.random()*9))+1;
			}
		}
	}

	/**
	 * 
	 * @param data assume it represents a square matrix with at least one row
	 */
	public NumberCrossword_Stage1(int[][] data) {
		board = new int[data.length][data.length];
		for(int i=0; i < board.length; i++) {
			for(int k=0; k < board.length; k++) {
				board[i][k] = data[i][k];
			}
		}
	}

	public String toString() {
		String result = "";
		for(int i=0; i < board.length; i++) {
			for(int k=0; k < board.length; k++) {
				result+=board[i][k]+" ";
			}
			result+="\n";
		}
		return result;
	}

	/**
	 * 
	 * @param target
	 * @return in row-first order, if target can be constructed by adding 
	 * adjacent items.
	 * 
	 * for each position, 
	 * first check items in a row, 
	 * and only if you cannot construct target then, check items in a column
	 * 
	 * IMPORTANT: an item MUST be considered for inclusion before it's excluded.
	 * 
	 * while checking in a row,
	 * if you use items data[i][k] and data[i][k+x] (x>=0) 
	 * you must use all items between those two 
	 * that is (data[i][k+1], ... data[i][k+x-1])
	 * 
	 * similarly while checking in a column, 
	 * if you use items data[i][k] and data[i+x][k] (x>=0) 
	 * you must use all items between those two 
	 * that is (data[i+1][k], ... data[i+x-1][k])
	 */
	public String canGet(int target) {
		String result = "";
		for(int row=0; row < board.length; row++) {
			for(int column=0; column < board.length; column++) {
				String temp = canGetRow(target, 0, row, column, "0");
				if(temp!=null) {
					result = result + "["+row+","+column+"] Right:\n"+temp + "\n";
				}
				else {
					temp = canGetColumn(target, 0, row, column, "0");
					if(temp!=null) {
						result = result + "["+row+","+column+"] Down:\n"+temp + "\n";
					}
				}
			}
		}
		if(result.isEmpty())
			return null;
		return result;
	}

	private String canGetRow(int target, int soFar, int row, int col, String result) {
		if(soFar == target) {
			return result+"\n";
		}
		if(col >= board.length) {
			return null;
		}
		String status = canGetRow(target, soFar + board[row][col], row, col+1, "("+result+")+"+board[row][col]);
		if(status != null) {
			return status;
		}
		return null;
	}

	private String canGetColumn(int target, int soFar, int row, int col, String result) {
		if(soFar == target) {
			return result+"\n";
		}
		if(row >= board.length) {
			return null;
		}
		String status = canGetColumn(target, soFar + board[row][col], row+1, col, "("+result+")+"+board[row][col]);
		if(status != null) {
			return status;
		}
		return null;
	}

	public static void main(String[] args) {
		//we will use other tests too!
		int[][] data = {{3, 5, 7, 5, 7}, 
				{6, 5, 5, 2, 6},
				{6, 6, 5, 6, 1},
				{3, 9, 3, 9, 7},
				{4, 5, 7, 3, 3}};
		NumberCrossword_Stage1 c = new NumberCrossword_Stage1(data);
		//NumberCrossword_Stage2 c = new NumberCrossword_Stage2(8);
		System.out.println(c);
		int target = 9;
		//int target = (int)(Math.random() * 100);
		String result = c.canGet(target);
		if(result != null) {
			System.out.println("Target "+target+"\n\n"+result);
		}
		else {
			System.out.println("Target "+target+" could not be constructed");	
		}
	}
}
