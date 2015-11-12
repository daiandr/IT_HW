
public class Task6 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean areEqual = false;

		if (arr.length == arr2.length) {

			for (int index = 0; index < arr.length; index++) {

				if (arr[index] == arr2[index]) {
					areEqual = true;
				} else {
					areEqual = false;
					break;
				}
			}

		}
		if (areEqual == true) {
			System.out.println("The arrays are equal!");

		} else {
			System.out.println("The arrays aren't equal!");
		}
	}

}
