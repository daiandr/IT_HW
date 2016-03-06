import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter N :");
		int n = key.nextInt();
		System.out.println("Enter M : ");
		int m = key.nextInt();

		if (n >= 10 && n <= 5555 && m >= 10 && m <= 5555 && n < m) {
			for (int i = m; i >= n; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ",");
				} else {
					continue;
				}
			} // for
		} // if
		else {
			System.out.println("Numbers must be between 10 and 5555( and N < M ) !");
		}

	}

}
