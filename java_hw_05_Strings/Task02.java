public class Task02 {
	public static void main(String[] args) {

		String text = "pokemon whatever";
		int space = text.indexOf(' ');

		String word1 = text.substring(0, space);
		String word2 = text.substring(space + 1);

		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();

		for (int index = 0; index < 5; index++) {
			char temp = '0';
			temp = w1[index];
			w1[index] = w2[index];
			w2[index] = temp;
		}

		if (word1.length() > word2.length()) {
			System.out.println(word1.length());
			for (int index = 0; index < w1.length; index++) {
				System.out.print(w1[index]);
			}
		}
		if (word2.length() > word1.length()) {
			System.out.println(word2.length());
			for (int index = 0; index < w2.length; index++) {
				System.out.print(w2[index]);
			}
		}
		if (word1.length() == word2.length()) {
			System.out.println("The 2 words are equal!");
			System.out.println(word1.length());
		}
	}
}
