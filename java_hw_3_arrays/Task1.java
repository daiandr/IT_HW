public class Task1 {
	public static void main(String[] args) {

		int[] array = { 10, 3, 5, 8, 6, -3, 7, -6 };
		int min = array[1];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min && array[i] % 3 == 0) {

				min = array[i];

			}
		}
		System.out.println("The lowest number that divides by 3 is: " + min);

	}

}
