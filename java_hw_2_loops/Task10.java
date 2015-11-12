import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Enter a number : ");
		int num = key.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;

			}

		}
		if (isPrime == true) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number isn't prime");
		}

	}

}
