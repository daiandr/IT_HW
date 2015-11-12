import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Enter A : ");
		int a = key.nextInt();
		System.out.println("Enter B : ");
		int b = key.nextInt();
		int sum = 0;
		int sum2 = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {

				int square = i * i;
				sum = sum + square;
				if (sum - sum2 >= 200) {
					System.out.println("BREAK");
					break;
				} else {
					if (square % 3 == 0) {
						System.out.print("skip3,");
						sum2 = sum2 + square;
					} else {

						System.out.print(square + ",");
					}

				} // else_break

			} // for
		} else {
			System.out.println("'A' must have higher value than 'B' !");
		}
	}// main

}
