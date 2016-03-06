import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();
		if (num > 0 && num <= 27) {
			for (int i = 100; i <= 999; i++) {

				int first = i / 100;
				int a = i % 100;
				int second = a / 10;
				int b = a % 10;
				int third = b / 1;

				if (first + second + third == num) {
					System.out.print(i + ",");
				} else {
					continue;
				}

			} // for
		} // if
		else {
			System.out.println("The number must be between +1 and +27 !");
		}
	}// main

}
