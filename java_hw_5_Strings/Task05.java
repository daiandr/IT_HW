import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String word1 = key.next();
		System.out.println("Enter string 2: ");
		String word2 = key.next();

		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();

		for (int index = 0; index < w1.length; index++) {
			System.out.print(w1[index]);
			if (w1[index] == w2[0]) {
				for (int i = 1; i < w2.length; i++) {
					System.out.print(w2[i]);
				}
			}
			System.out.println();
		}
	}
}
