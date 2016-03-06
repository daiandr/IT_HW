import java.util.Scanner;

public class Task21 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = key.nextInt();

		int color = num % 4;
		int rank = ((num - 1) / 4) + 2;

		if (rank < 11) {
			System.out.println(rank + " of");
		} else {

			switch (rank) {
			case 11:
				System.out.println("J of ");
				break;
			case 12:
				System.out.println("Q of");
				break;
			case 13:
				System.out.println("K of");
				break;
			case 14:
				System.out.println("A of");
				break;
			}

		}
		switch (color) {
		case 0:
			System.out.println("spades");
			break;
		case 1:
			System.out.println("clubs");
			break;
		case 2:
			System.out.println("diamonds");
			break;
		case 3:
			System.out.println("hearts");
			break;
		}

	}

}
