import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter a number: ");
		int number = key.nextInt();
		arr[0] = number;
		arr[1] = number;

		for (int index = 2; index < arr.length; index++) {

			arr[index] = arr[index - 1] + arr[index - 2];

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
