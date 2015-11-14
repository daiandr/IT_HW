public class Task8 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 4, 5, 5, 5 };

		int count = 1;
		int num = 0;// repeating number
		int max = 0;// maximum repeats

		for (int index = 0; index < arr.length - 1; index++) {

			if (arr[index] == arr[index + 1]) {
				count++;

			} else {
				count = 0;
			}

			if (count > max) {
				max = count;
				num = arr[index];

			}
		} // for
		max++;

		int[] arr2 = new int[max];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = num;
			System.out.print(arr2[i] + ",");
		} // for_print

	}// main
}
