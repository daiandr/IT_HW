
public class Task4 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int last = arr.length;
		boolean isMirrored = false;

		for (int index = 0; index < arr.length / 2; index++) {

			if (arr[index] == arr[last - 1]) {
				last--;
				isMirrored = true;
			} else {
				System.out.println("The array isn't mirrored! ");
				break;
			}

		}
		if (isMirrored == true) {

			System.out.println("The array is mirrored! ");

		}

	}

}
