
public class Task2 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
		int[] reverseArr = new int[arr.length];
		int length = reverseArr.length;

		for (int i = 0; i < arr.length / 2; i++) {

			reverseArr[i] = arr[i];
			reverseArr[length - 1] = arr[i];
			length--;

		}
		for (int index = 0; index < reverseArr.length; index++) {
			System.out.print(reverseArr[index] + ",");
		}

	}

}
