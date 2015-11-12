import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();

		for (int row = 1; row <= num; row++) {
			for (int space = 1; space <= num - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= (2 * row) - 1; star++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
