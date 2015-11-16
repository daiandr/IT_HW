import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Enter array length:");
		int n = key.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = key.nextInt();
		} // arr

		System.out.println("Enter array2 length:");
		int n2 = key.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter array2 elements: ");
		for (int index = 0; index < arr2.length; index++) {
			arr2[index] = key.nextInt();
		} // arr2

		boolean areEqual = false;
		if (arr.length == arr2.length) {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == arr2[index]) {
					areEqual = true;
				} else {
					areEqual = false;
					break;
				}
			}
		}
		if (areEqual == true) {
			System.out.println("The arrays are equal!");
		} else {
			System.out.println("The arrays aren't equal!");
		}
	}
}
