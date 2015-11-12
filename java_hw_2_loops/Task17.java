import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter side length : ");
		int side = key.nextInt();
		System.out.println("Enter symbol : ");
		char symbol = key.next().charAt(0);

		if (side >= 3 && side <= 20) {
			for (int row = 1; row <= side; row++) {

				if (row != 1 && row != side) {
					System.out.print("*");
					for (int i = 1; i <= side - 2; i++) {
						System.out.print(symbol);
					}
					System.out.print("*");

				} else if (row == 1 || row == side) {
					for (int j = 1; j <= side; j++) {
						System.out.print("*");
					}
				}

				System.out.println();
			}
		} else {
			System.out.println("The number must be between 3 & 20 !");
		}
	}

}
