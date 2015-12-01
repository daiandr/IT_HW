
public class Task08 {
	public static void main(String[] args) {

		String text = "kapak";
		char[] txt = text.toCharArray();
		int length = txt.length;
		boolean flag = true;

		for (int index = 0; index < txt.length / 2; index++) {
			if (txt[index] == txt[length - 1]) {
				length--;
			} else {
				flag = false;
				System.out.println("The string is not a palindrome!");
				break;
			}
		}
		if (flag == true) {
			System.out.println("The string is a palindrome!");
		}
	}
}
