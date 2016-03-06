
public class Task04 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] arr2 = new int[4][4];
		int help = 3;

		for (int r = 0; r < 4; r++) {

			for (int c = 0; c < 4; c++) {
				if (help >= 0) {
					arr2[r][c] = arr[help][r];
					help--;
				}

			}
			help = 3;
		}

		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}

	}
}