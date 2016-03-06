
public class Task20 {
	public static void main(String[] args) {

		int num = 0;
		int first = 0;

		for (int col = 0; col < 10; col++) {
			System.out.print(first);
			num = first + 1;
			if (first == 9) {
				num = 0;
			}
			for (int row = 0; row < 9; row++) {
				System.out.print(num);
				if (num >= 9) {
					num = 0;
				} else {

					num++;
				}

			}
			first++;
			System.out.println();
		}
	}

}
