
public class Task18 {
	public static void main(String[] args) {

		int[] a1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] a2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] a3 = new int[a1.length];

		if (a1.length != a2.length) {
			System.out.println("The arrays must have the same length!");
		} else {
			for (int index = 0; index < a1.length; index++) {
				if (a1[index] >= a2[index]) {
					a3[index] = a1[index];
				} else {
					a3[index] = a2[index];
				}
			}
			for (int i = 0; i < a3.length; i++) {
				System.out.print(a3[i] + ",");
			}

		}
	}
}
