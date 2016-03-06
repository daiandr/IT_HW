import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int[] arr = new int[7];
		System.out.println("Enter array elements (7): ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = key.nextInt();
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 5 == 0 && arr[index] > 5) {
				System.out.print(arr[index] + ",");
			}
		}
	}

}
