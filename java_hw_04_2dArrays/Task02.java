import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = key.nextInt();
		int cols = rows - 1;

		int[][] arr = new int[rows][rows];
		System.out.println("Enter array elements: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = key.nextInt();
			}
		} // enter_nums

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][cols--] + ",");

		} // diagonal_1
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + ",");

		} // diagonal_2

	}

}
