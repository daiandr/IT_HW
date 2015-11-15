
public class Task01 {

	public static void main(String[] args) {

		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 11 }, { 61, 69, 63, 64, -22 } };
		int max = arr[0][0];
		int min = arr[0][0];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length -2; col++) {
				if (max < arr[row][col + 1]) {
					max = arr[row][col + 1];
				}
				if (min > arr[row][col + 1]) {
					min = arr[row][col + 1];

				}
			} // for_col
		} // for_row

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		} // print

		System.out.println("min: " + min);
		System.out.println("max: " + max);		
	}// main

}
