import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = key.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = key.nextInt();
		}

		int last = arr.length;
		boolean isMirrored = false;

		for (int index = 0; index < arr.length / 2; index++) {

			if (arr[index] == arr[last - 1]) {
				last--;
				isMirrored = true;
			} else {
				System.out.println("The array isn't mirrored! ");
				break;
			}

		}
		if (isMirrored == true || n == 1) {

			System.out.println("The array is mirrored! ");

		}

	}

}
