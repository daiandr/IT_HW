import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = key.nextInt();
		int initial = num;
		int reverse = 0;
		int last;

		while (num > 0) {
			last = num % 10;
			reverse = reverse * 10 + last;
			num = num / 10;
		}
		if (reverse == initial)
			System.out.println("The number is a Palindrome !");
		else
			System.out.println("The number isn't a Palindrome !");
	}

}
