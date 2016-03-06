import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = key.nextInt();

		int i = 1;
		if (num >= 1 && num <= 999) {
			while (i <= 10) {
				if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {

					System.out.print(i++ + ":" + num + ", ");
				}
				num++;
			}
		} else {
			System.out.println("The number must be between 1 & 999 !");
		}
	}

}
