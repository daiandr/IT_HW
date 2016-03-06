import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = key.nextLine();
		System.out.println("Enter text2: ");
		String text2 = key.nextLine();
		if (text.length() < 40 && text2.length() < 40) {
			System.out.println(text.toUpperCase() + " " + text.toLowerCase() + " " + text2.toUpperCase() + " "
					+ text2.toLowerCase());
		} else {
			System.out.println("Each text must contain less than 40 symbols! ");
		}
	}

}
