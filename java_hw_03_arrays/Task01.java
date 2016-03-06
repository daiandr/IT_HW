import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter number of array elements:");
		int n = key.nextInt();

		int[] array = new int[n];

		System.out.println("Enter array elements: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = key.nextInt();
		}

		int num = 999999999;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] <= num) {
					num = array[i];
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
		System.out.println("The lowest number that divides by 3 is: " + num);
	}

}
