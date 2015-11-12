import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();
		int table = num;

		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num - 1; col++) {
				System.out.print(table - 1);
			}
			System.out.println(table - 1);

			table = table + 2;
		}
	}

}
