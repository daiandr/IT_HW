import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = key.nextInt();
		int value = 0;

		for (int i = n; i > 0; i--) {

			value = value + 3;
			System.out.print(value + ",");

		}

	}
}
