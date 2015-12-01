import java.util.Scanner;

public class Task04 {
	
	static int Ascii(String s) {
		int sum = 0;
		char[] arr = s.toCharArray();
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}
	

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String names = key.nextLine();
		int coma = names.indexOf(',');
		String name1 = names.substring(0, coma);
		String name2 = names.substring(coma + 1);

		if (Ascii(name1) < Ascii(name2)) {
			System.out.println(name2);
		}
		if (Ascii(name1) > Ascii(name2)) {
			System.out.println(name1);
		}
		if (Ascii(name1) == Ascii(name2)) {
			System.out.println("The ASCII code sum of both strings is equal!");
		}
	}
}
