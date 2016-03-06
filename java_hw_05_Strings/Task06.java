
public class Task06 {
	public static void main(String[] args) {

		char space = ' ';
		String text = "cApItAlIzE this string after WHITE SPACES";
		char[] txt = text.toCharArray();

		for (int index = 0; index < txt.length - 1; index++) {
			if (txt[index] == space) {
				txt[index + 1] = Character.toUpperCase(txt[index + 1]);
			} else {
				txt[index + 1] = Character.toLowerCase(txt[index + 1]);
			}
		}
		txt[0] = Character.toUpperCase(txt[0]);

		for (int index = 0; index < txt.length; index++) {
			System.out.print(txt[index]);
		}
	}
}
