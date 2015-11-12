import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second nnumber : ");
		int num2 = sc.nextInt();

		System.out.println("You entered " + num1 + " and " + num2);

		if (num1 < num2) {
			for (int i = num1; i <= num2 ; i++) {
				System.out.println(i);
			}
		} else if (num2 < num1) {
			for (int i = num2; i <= num1 ; i++) {
				System.out.println(i);
			}

		} else {
			System.out.println("The numbers are equal !");
		}

	}
}