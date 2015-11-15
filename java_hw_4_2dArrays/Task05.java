
public class Task05 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sumRow = 0;
		int maxRow = -999999999;
		int sumCol = 0;
		int maxCol = -999999999;

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				sumRow = sumRow + arr[r][c];
				sumCol = sumCol + arr[c][r];
			}
			if (sumRow > maxRow) {
				maxRow = sumRow;
			}
			if (sumCol > maxCol) {
				maxCol = sumCol;
			}
			sumCol = 0;
			sumRow = 0;
		}

		System.out.println("Highest sum by row: " + maxRow);
		System.out.println("Highest sum by column: " + maxCol);
		if (maxRow > maxCol) {
			System.out.println("Max sum by row > max sum by col");
		} else if (maxRow < maxCol) {
			System.out.println("Max sum by row < max sum by col");
		} else if (maxRow == maxCol) {
			System.out.println("Max sum by row = max sum by col");
		}
	}

}
