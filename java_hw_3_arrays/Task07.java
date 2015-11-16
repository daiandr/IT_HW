import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter array length:");
		int n = key.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = key.nextInt();
		}

		int[] newArr = new int[arr.length];

		newArr[0] = arr[1];
		newArr[newArr.length - 1] = arr[arr.length - 2];

		for (int index = 1; index < newArr.length - 1; index++) {
			newArr[index] = arr[index - 1] + arr[index + 1];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ",");
		}

	}

}
