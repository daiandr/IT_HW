import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();
		if (num <= 200 && num >= 10) {
			for (int i = 200; i >= 10; i--) {
				if (i % 7 == 0 && i < num) {
					System.out.print(i + ",");
				} else {
					continue;
				}
			}
		} else {
			System.out.println("The number must be between 10 and 200 !");

		}
	}

}
