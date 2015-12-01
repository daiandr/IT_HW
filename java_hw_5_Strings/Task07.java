
public class Task07 {
	public static void main(String[] args) {

		String text = "asdbjk sfkdajs sakas aas";

		char[] txt = text.toCharArray();
		int count = 1;
		int maxCount = 0;
		int max = 0;
		if (txt[0] == ' ') {
			count = 0;
		}

		for (int index = 0; index < txt.length; index++) {
			if (txt[index] == ' ') {
				count++;				
				if (max < maxCount) {
					max = maxCount;
				}
				maxCount = 0;
				continue;
			}
			maxCount++;

		}
		System.out.print(count + " words,");
		System.out.println(" the longest word has " + max + " symbols.");

	}
}
