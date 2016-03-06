import java.util.Scanner;

public class Task03 {

	static void Compare(String word1, String word2) {
		for (int index = 0; index < word1.length(); index++) {
			if (word1.charAt(index) != word2.charAt(index)) {
				System.out.print(index + " ");
				System.out.println(word1.charAt(index) + " - " + word2.charAt(index));
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		String word1 = key.next();
		String word2 = key.next();

		if (word1.length() > word2.length()) {
			System.out.println("Word 1 is longer than word2!");
			System.out.println("Difference in positions: ");
			Compare(word2, word1);
		}
		if (word1.length() < word2.length()) {
			System.out.println("Word 2 is longet tahn word1!");
			System.out.println("Difference in positions: ");
			Compare(word1, word2);
		}
		if (word1.length() == word2.length()) {
			System.out.println("The words have equal length!");
			System.out.println("Difference in positions: ");
			Compare(word1, word2);
		}
	}
}
